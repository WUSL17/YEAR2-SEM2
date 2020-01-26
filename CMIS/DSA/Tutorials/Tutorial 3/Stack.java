public class Stack {
    private int maxSize;
    private Object[] stackArray;
    private int top;

    public Stack(int size){
        maxSize = size;
        stackArray = new Object[maxSize];
        top = -1;
    }

    public void push(Object val){
        //Check whether stack is full
        if (top == maxSize -1){
            System.out.println("Stack is full");
        }else {
            stackArray[++top] = val;
        }
    }

    public Object pop(){
        if (top == -1){
            System.out.println("Stack is empty");
            return -99;
        }else {
            return stackArray[top--];
        }
    }

    public Object peek(){
        if (top == -1){
            System.out.println("Stack is empty");
            return -99;
        }else {
            return stackArray[top];
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }

    boolean isFull(){
        return top == maxSize -1;
    }

    int getNoOfItems() {
        return top + 1;
    }
}
