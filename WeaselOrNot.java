import java.util.Scanner;
import java.util.stream.StreamSupport;

public class WeaselOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        boolean yep, nope;

        System.out.println("Type the word \"weasel\", please");
        word = sc.next();
        yep = ("weasel").equals(word);
        nope = ! ("weasel").equals(word);

        System.out.println("Yout typed the word \"weasel\": "+ yep);
        System.out.println("You ignored polite instructions: "+ nope);
    }
    //Ca a quand même foctionné car on cherche quand même pour si weasel est égal au mot que l'on a entré dans le programme
}
