import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double x, y;
       String ready, scared;

       System.out.print("Are you ready? ");
       System.out.print("(Y/N): ");
       ready = sc.next();

        while (! ready.equals("Y")){
        System.out.println("Take a breather, and come back later :)");
        System.out.print("\nAre you ready now?: ");
        ready = sc.next();
        }

       System.out.println("OK, let's go!");


       System.out.println("\nGive me a number, and I'll find the quare root. ");
       System.out.print("(No negative please): ");
       x = sc.nextDouble();

       while (x < 0){
           System.out.println("I won't take the square root of a negative. ");
           System.out.print("\nNew number: ");
           x = sc.nextDouble();

       }

       y = Math.sqrt(x);

       System.out.println("The square root of "+ x +" is "+ y);
    }
}
