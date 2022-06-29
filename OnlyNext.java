
import java.util.Scanner;

public class OnlyNext {
    public static void main(String[] args) {
        Scanner clavier = new Scanner( System.in );

        System.out.print( "Entrer deux nombres entiers " );
        System.out.print( "séparés par des espaces > " );
        int nombre = clavier.nextInt(); // saisit un nombre
        int nombre_2 = clavier.nextInt();
        clavier.nextLine();
        
        System.out.print( "C'est quoi ton nom? > " );
        String nom = clavier.nextLine(); // saisit du texte

        System.out.println( nom + ", tu as entré le nombre " + nombre + " " + nombre_2 );
    }
}
