import java.util.*;

public class increament
{
    public static void main(String[] args)
    {
        int a = 5;
        int b;

        // Post-increment example (a++)
        b = a++;
        System.out.println("Post-increment (a++):");
        System.out.println("Value of b: " + b); // b is assigned 5
        System.out.println("Value of a: " + a); // a becomes 6

        System.out.println("-------------------------");

        a = 5; // Reset a to 5

        // Pre-increment example (++a)
        b = ++a;
        System.out.println("Pre-increment (++a):");
        System.out.println("Value of b: " + b); // b is assigned 6
        System.out.println("Value of a: " + a); // a becomes 6
    }
}