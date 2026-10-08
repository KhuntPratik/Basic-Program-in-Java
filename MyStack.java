public class MyStack{
    int [] stack;
    int top;
    int size;

    MyStack(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int data){
        if(top == size -1){
            System.out.println("Stack is overflow");
        }

        top++;
        stack[top] = data;
    }

    void pop(){
        if(top == -1){
            System.out.println("Stack is underflow");
        }

        int value = stack[top];
        top--;

        System.out.println(value);
    }

    void peek(){
        if(top == -1){
            System.out.println("Stack is underflow");
        }
        System.out.println(stack[top]);

    }

     void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        MyStack ms = new MyStack(5);

        ms.push(10);
        ms.push(20);
        ms.display();
    }
}