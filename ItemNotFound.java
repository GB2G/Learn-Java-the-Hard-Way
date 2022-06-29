import java.util.Scanner;

public class ItemNotFound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] heroes = {"Abderus", "Achilles", "Aeneas", "Ajax", "Abderus", "Amphitryon", "Bellerophon", "Castor", "Chrysippus", "Deadalus", "Castor", "Diomedes", "Eleusis", "Eunostus", "Eleusis", "Ganymede", "Hector", "Iolaus", "Jason", "Hector", "Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus"};
        String guess;
        boolean found;
        int compte = 0;

        System.out.println("Pop Quiz!");
        System.out.print("Name any **mortal** hero from Greek mythology: ");
        guess = sc.next();

        found = false;
        for ( String hero : heroes ){
            if (guess.equals(hero)){
                System.out.println("That's one of them!");
                found = true;
            }
        }

        for ( String h : heroes ){
            if (h.equals(guess)) compte++;
        }

        System.out.printf("We encountered %s %d times", guess, compte );

        if ( found == false ){
            System.out.println("No, "+ guess +" wasn't a Greek mortal hero.");
        }
    }
}
