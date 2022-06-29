import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class GenderTitles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title;

        System.out.print("First name: ");
        String first = sc.next();

        System.out.print("Last name: ");
        String last = sc.next();

        System.out.print("Gender (M/F): ");
        String gender = sc.next();

        System.out.print("Age: ");
        int age = sc.nextInt();

        if (age < 20){
            title = first;
        }

        else {
            if (gender.equals("F")){
                System.out.print("Are you married," + first + "? (Y/N): ");
                String married = sc.next();
                if (married.equals("Y")){
                    title = "Mrs.";
                }
            else {
                title = "Ms.";
            }
        }

        else {
            title = "Mr.";
        }
      }
     System.out.println("\n" + title + " " + last);
    }
}
