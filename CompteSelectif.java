import java.util.Scanner;

public class CompteSelectif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lettre = "";
        String lettreAIgnorer = "b";
        int compte = 0;

        System.out.println("Entrer un lettre. Pour quitter taper la lettre [q].");

        while (! lettre.equals("q")){
            System.out.print("> ");
            lettre = sc.nextLine().toLowerCase(); //va convertir l'entree en minuscules
            if ( !lettre.equals(lettreAIgnorer)){
                compte++;
            }

        }

        System.out.printf("Sans compter les '%s', tu as entré %d lettres.\n", lettreAIgnorer, compte);
    }
    
}
// On peut juste dire que si la lettre est pas egale a la lettre a ignorer de le compter