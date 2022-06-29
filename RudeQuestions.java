
import java.util.Scanner;

public class RudeQuestions {
    public static void main(String[] args){
        String name, weapon;
        int age;
        double weight, income;

        Scanner sc = new Scanner(System.in);

        System.out.print("Hello, what is your name? ");
        name = sc.next();

        System.out.print("Hi, "+ name + "! How old are you? ");
        age = sc.nextInt();

        System.out.println("So you're "+ age +" years old eh? Thats not too old.");
        System.out.print("How much do you weigh "+ name+"? ");
        weight = sc.nextDouble();

        System.out.println(weight + "! You better keep that quiet!");
        System.out.print("Finally, what's you income "+ name + "? ");
        income = sc.nextDouble();

        System.out.println("Hopefully that's "+ income + " per hour!");
        System.out.println("And not per year :P");
        System.out.println("Well, thank for answering my rude questions");
        System.out.println(name + ".");

        System.out.print("What kind of weapon do you wield? ");
        weapon = sc.next();

        System.out.println("Ah! a "+ weapon + ", a fine weapon for a programmer!");
        System.out.println("I would challenge you to a duel, but my "+ weapon + " is still in the shop ;)");
        System.out.println("Thank you for answering the bonus question!");
    }
}
/** 1. Non ca ne brise pas puisque une valeur Int peut être convertis en double en ajoutant un ".0" à la fin
 *     Mais quand on parle de convertir un double en integer, cela n'est pas possible car la valeur double a un décimal à la fin
 *  2. Non parce que un String peut être n'importe quelle caractère au moins que cela est entre guillements
 *  3. La valuer Sting peut contenir n'importe quoi et donc le programme ne vas pas exploser
 *     À la question d'âge, n'importe quoi qui n'est pas un Int vas exploser le programme
 *     Aux questions de poids et de salaire, n'importe quoi qui n'est pas une valeur numérique vas le briser
 *     La dernière question as le même problème que la première
 */