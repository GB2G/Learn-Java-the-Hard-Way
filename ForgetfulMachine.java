
import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What city is the capital of france?");
        keyboard.next();

        System.out.println("What is 6 multiplied by 7?");
        keyboard.nextInt();

        System.out.println("Enter a number between 0.0 and 1.1");
        keyboard.nextDouble();

        System.out.println("Is there anything else you would like to say?");
        keyboard.next();
    }
}
/**Le programme s'est brisé à la deuxième question quand j'ai tapé 10000000000000000000000000000 
 * Cela a cassé le programme car la valeur est plus grand que 2 147 483 647
 * Le programme s'est brisé à la question 2 aussi lorsque j'ai tapé "yeet"
 * Cela a cassé le programme car elle va seulement accepter un Integer comme valeur
 * Le programme s'est brisé à la question 3 lorsuqe j'ai tapé "Double"
 *  Cela a cassé le programme car elle va seulement accepter un Double comme valeur
*/
