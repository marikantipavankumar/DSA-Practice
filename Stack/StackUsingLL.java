
import java.util.Stack;

// public class StackUsingLL {
    
//     class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     private  Node top;

//     public StackUsingLL(){
//         this.top = null;
//     }

//     public void push(int value){
//         Node newnode = new Node(value);
//         newnode.next = top;
//         top = newnode;
//         System.out.println(value +" pushed onto the stack");
//     }

//     public  int pop(){
//         if(isEmpty()){
//             System.out.println("Can't pop element from the Empty stack:");
//             return -1;
//         }
//         int poppedvalue = top.data;
//         top = top.next;
//         System.out.println("Popped value from the stack is :"+poppedvalue);

//         return poppedvalue;
//     }

//     public int peek(){
//         if(isEmpty()){
//             System.out.println("can't pop from the empty stack:");
//             return -1;
//         }

//         int peekElement  = top.data;
//         return peekElement;

//     }

//     public boolean isEmpty(){
//         return top ==null;
//     }

//     public void display(){
//         if(isEmpty()){
//             System.out.println("Stack is Empty already:");
//             return;
//         }
//         System.out.print("Stack elements are (top to bottom): ");

//         Node current = top;
//         while(current != null){
//             System.out.println(current.data +" ");

//             current = current.next;

//         }

//         System.out.println();
//     }

//     public static void main(String[] args) {
//         StackUsingLL mystack =  new StackUsingLL();
//         mystack.push(10);
//         mystack.push(20);
//         mystack.push(30);
//         mystack.push(40);
//         mystack.display();

//         mystack.pop();
//         mystack.display();

//         System.out.println("top most element in the stack is:"+mystack.peek());
        


//     }


// }


public  class  StackUsingLL{
    class Node{
        int data;
        Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    }
    private Node top;
    public StackUsingLL(){
         this.top = null;
    }

    public void push(int value){
        Node newnode = new Node(value);
        
        newnode.next = top;
        top = newnode;
        System.out.println(value +"pushed onto the stack");


    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Can't pop from the Empty stack:");
            return -1;
        }

        int poppedElement  = top.data;
        top = top.next;
        System.out.print(poppedElement +" is popped from the stack");
        return poppedElement;
    }

    public int peek(){

          if(isEmpty()){
            System.out.println("Can't  peek from the Empty stack:");
            return -1;
        }

        int peekElement  = top.data;
        System.out.print(peekElement +" is top most Element in the stack");
        return peekElement;

    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is already empty");
        }

        while(top!=null){
            System.out.print(top.data);
            top = top.next;
        }
        System.out.println();
    }

    public boolean isEmpty(){
            return top==null;
    }


    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.peek();

        System.out.println("popped Element is :"+stack.pop());
        System.out.println("popped Element is :"+stack.pop());
        stack.peek();

        stack.display();

    }
}