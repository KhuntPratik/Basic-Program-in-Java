public class MyQueue {
    int [] queue;
    int front;
    int rear;
    int size;

    MyQueue(int size){
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int data){

        if(rear == size-1){
            System.out.println("Queue overflow");
        }
        rear++;
        queue[rear] = data;
    }

    void dqueue(){
        if (front >rear){
             System.out.println("Queue Underflow");
        }

        int data = queue[front];
        front++;

        System.out.println(data);
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
      
       MyQueue q = new MyQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Queue:");
        q.display();

        q.dqueue();

        System.out.println("After Dequeue:");
        q.display();

    }
}
