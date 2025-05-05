import java.util.*;

public class MyQueue {
    private int front, rear, capacity;
    private int[] queue;

    public MyQueue(int size) {
        front = 0;
        rear = 0;
        capacity = size;
        queue = new int[size];
    }

    public void enqueue(int item) {
        if (rear == capacity) {
            System.out.println("Queue is full (Overflow)");
        } else {
            queue[rear] = item;
            rear++;
            System.out.println(item + " enqueued");
        }
    }

    public void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty (Underflow)");
        } else {
            System.out.println(queue[front] + " dequeued");
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
        }
    }

    public void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i < rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEnter Your Choice: \n1. Enqueue \n2. Dequeue \n3. Display \n4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = sc.nextInt();
                    q.enqueue(value);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
