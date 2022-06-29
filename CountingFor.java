import java.util.Scanner;

public class CountingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String message;

        System.out.println("Enter a message and I'll display it five times");
        System.out.print("Message > ");
        message = sc.nextLine();

        for ( n = 1; n <= 5; n++){ //**Faut toujours avoir un initialisation au premier for statement pour donner une valeur a la vairable */
            System.out.println( n + " " + message);
        }

        System.out.println("\nNow I'll show it 10 times and count by 5s.");
        for ( n = 5; n <= 50; n += 5){
            System.out.println( n + " " + message);
        }

        System.out.println("\nFinally, 3 times counting backwards");
        for ( ; n > 0; n -= 1){
            System.out.println( n + " " + message);
        }
// Le programme compile encore mais la valeur initiale de n est la derniere valeur du deuxieme for lopp donc 50.
    }
}
