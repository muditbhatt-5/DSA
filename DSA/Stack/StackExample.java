import java.util.Scanner;

public class StackExample {
    static final int MAX = 100;
    int top;
    int[] stack = new int[MAX];

    // Constructor
    StackExample() {
        top = -1;
    }

    // Push operation
    void push(int value) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    // Pop operation
    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int value = stack[top--];
            return value;
        }
    }

    // Display stack elements
    void display() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements are:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        StackExample stack = new StackExample();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != 0) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
