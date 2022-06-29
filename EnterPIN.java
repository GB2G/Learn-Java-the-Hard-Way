import java.util.Scanner;

public class EnterPIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin, entry;
        String password, word;
        pin = 12345;
        password = "jello";

        System.out.println("WELCOME TO THE BANK OF JAVA");
        System.out.println("ENTER YOU PASSWORD: ");
        word = sc.next();

        while (word != password){
            System.out.println("\n INCORRECT PASSWORD, TRY AGAIN");
            System.out.println("ENTER PASSWORD");
            word = sc.next();
        }

        if (word.equals(password)){
            System.out.println("Correct password");
        }

        System.out.println("ENTER YOUR PIN: ");
        entry = sc.nextInt();

        while (entry != pin){
            System.out.println("\nINCORRECT PIN. TRY AGAIN");
            System.out.println("ENTER YOUR PIN: ");
            entry = sc.nextInt();
        }

        if (entry == pin){
            System.out.println("PIN ACCEPTED. YOUR BALANCE IS $425.67");
        }
    }
    
}
