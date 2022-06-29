import java.util.Scanner;

public class StringCase {
    public static void main(String[] args) {
        String texte = "Blue";
        Scanner sc = new Scanner(System.in);

        System.out.println("What is my favourite color?: ");
        texte = sc.nextLine();
       
        System.out.println(texte.equalsIgnoreCase("Blue"));


    }
    
}
