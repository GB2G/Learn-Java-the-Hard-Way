import java.util.Scanner;

public class ShallowGrandmother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        double income, cute, happy;
        boolean allowed, allowed2;

        System.out.println("How old are you?");
        age = sc.nextInt();

        System.out.println("How much money do you make a year?: ");
        income = sc.nextDouble();

        System.out.println("How cute are you, on a scale of 0.0 to 10.0? : ");
        cute = sc.nextDouble();

        System.out.println("How happy do you make my grandchild?");
        happy = sc.nextDouble();

        allowed = (age > 25 && age < 40 && (income > 50000 || cute > 7.0)); //older than 25, income higher than 50 000 and cuter than a 7.0 
        allowed2 = (happy > 7);

        System.out.println("Allowed to date my grandchild? : "+ allowed);
        System.out.println("Allowed to date grandmas offspring?: "+ allowed2);

    }
    
}
