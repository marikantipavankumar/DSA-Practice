public class StackEx1 {
    private  int maxSize;
    private  int[] stackArray;
    private int top;

    public StackEx1(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is Full:");
            return;
        }

        stackArray[++top] = value;
        System.out.println(value +"pushed into the stack");
    }

    public int  pull(){
        if(isEmpty()){
            System.out.println("Can't pop from the empty stack:");
            return -1;
        }
        return stackArray[top--];


    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty.. ");
            return -1;
        }

        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean  isFull(){
        return  (top ==maxSize-1);
    }

        public void display(){
            if(isEmpty()){
                System.out.println("stack is Empty.. No Element Found");
            }
            for(int i=0;i<=top;i++){
                System.out.print(stackArray[i] +" ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            StackEx1 myStack = new StackEx1(5);
            myStack.push(10);
            myStack.push(20);
            myStack.push(30);
            myStack.push(40);
            myStack.push(50);

            myStack.display();
            System.out.println("value popped from the stack is:"+ myStack.pull());
            System.out.println("value popped from the stack is:"+ myStack.pull());
            
            myStack.display();

            myStack.peek();

        }
    
}
