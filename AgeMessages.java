import java.util.Scanner;

public class AgeMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;

        System.out.println("How old are you?: ");
        age = sc.nextInt();

        System.out.println("You are: ");
        if (age < 13){
            System.out.println("\tToo young to get a facebook account");
        }

        else{
            System.out.println("You can create a Facebook account");
        }

        if (age < 16){
            System.out.println("\tToo young to get a driving permit");
        }

        else{
            System.out.println("You can drive");
        }

        if (age < 18){
            System.out.println("\tToo young to get a tattoo");
        }

        else{
            System.out.println("Can get a tattoo");
        }

        if (age < 21){
            System.out.println("\tToo young to drink alcohol");
        }

        if (age < 35){
            System.out.println("\tToo young to become the next donald Trump");
            System.out.println("\t\tso sad :(");
        }

        else{
            System.out.println("You can run for president");
        }

        if ( age >= 65){
            System.out.println("You can retire!");
        }

        else{
            System.out.println("Get back to work!");
        }

    }
    
}
