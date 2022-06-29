
import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner clavier = new Scanner( System.in );

        System.out.println( "Entrer votre nom complet, prénom et nom de famille." );
        System.out.print( ">  " );
        String nomComplet = clavier.nextLine(); //Faut l'écrire comme nextLine() et non pas juste next()

        System.out.println( "Votre nom est " + nomComplet );
    }
}
