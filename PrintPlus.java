
import java.util.Scanner;

public class PrintPlus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nom, invite = "> ";
        int occupants;

        System.out.println("Entrer votre nom:"+ invite);
        nom = sc.nextLine();

        System.out.print("Entrer le nombre d'occupants (personnes et animaux)\n");
        System.out.print("chez vous."+ invite);
        occupants = sc.nextInt();
        sc.nextLine(); // pour ignorer tout après le premier nombre sur la ligne

        System.out.println("\nJe confirme, deux fois :\n");

        System.out.println("Votre nom est "+ nom + " et vous êtes " + occupants + " chez vous?");
        System.out.printf("Votre nom est %s et vous êtes %d chez vous.\n", nom, occupants);
    }
}
