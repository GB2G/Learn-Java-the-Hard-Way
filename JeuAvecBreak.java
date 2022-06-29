import java.util.Scanner;

public class JeuAvecBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;

        System.out.println("Simulation de jeu...\n");
        boolean dudeParle = true; //Dude va parler

        while(true)
         /*     Cette boucle est intentionnellement infinie (toujours vrai) parce 
                qu'on va utiliser des break pour terminer la boucle / le jeu.
                Cela nous permet de terminer le jeu à différents endroits et/ou
                pour différentes raisons en plein milieu de la boucle. */
        {
            System.out.print("Actions du jeu... ");

            if (dudeParle){
                System.out.println("Dude va parler : '[Catchphrase]!!!'");
                dudeParle = false; //il ne vas plus parler
            }

            System.out.println("Taper [a] pour un autre ronde.");
            answer = sc.next();
            String a = "a";
            while (! answer.equals(a)){
                System.out.println("Taper [a] pour un autre ronde.");
                answer = sc.next();

            if (answer.equals(a)){
                continue;
            }
            }

            if (Math.random() > 0.8){
                System.out.println("\t VICTOIRE!!!");
                break; //sortir de cette boucle si la condition est atteinte
            }
            if (Math.random() > 0.6){
                System.out.println("\t DEFAITE!!!");
                break; //aussi, sortir si cette condition est atteinte
            }
            System.out.println("\t...le jeu se poursuite");

        }

        System.out.println("Fin de la simulation du jeu");
    }
}
//"Le jeu se poursuite" se fait ignorer