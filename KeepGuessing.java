import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret, guess;

        secret = 1 + (int)(Math.random()*10);

        System.out.println("I have chosen a number between 1 and 10.");
        System.out.println("Try to guess it");
        System.out.print("\nYour guess > ");
        guess = sc.nextInt();

        while (guess != secret){
            System.out.println("That is incorrect, guess again");
            System.out.print("\nYour guess > ");
            guess = sc.nextInt();
        }

        System.out.println("That's right! You're a good guesser.");
    }
    
}
//J'ai donner un option a l'utilisateur de soumettre un autre réponse