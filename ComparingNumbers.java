import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        double first, second;

        System.out.println("Give me two numbers. First: ");
        first = sc.nextDouble();

        System.out.println("Second: ");
        second = sc.nextDouble();


        if (first < second)
            System.out.println(first + " is less than " + second);
        

        if (first <= second)
            System.out.println(first + " is less than or equal to "+ second);
        

        if (first == second)
            System.out.println(first + " is equal to " + second);
        

        if (first >= second)
            System.out.println(first + " is greater than or equal to "+ second);
        

        if (first > second)
            System.out.println(first + " is greater than "+ second);
        

        {if ( first != second){
            System.out.println(first + " is not equal to "+ second);
            System.out.println("Hey.");
        }
    }

    }
}
//Partie 1: Oui la ligne "hey" compile mais seulement si first != second
//Partie 2: Tout fonctionne quand même comme prévu