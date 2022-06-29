
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class BMICalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double m, f, i, kg, pounds, bmi;

        System.out.print("Your height in feet only: ");
        f= sc.nextDouble();
      
        System.out.print("Your height in inches only: ");
        i = sc.nextDouble();

        System.out.print("Your weight in pounds: ");
        pounds = sc.nextDouble();

        kg = pounds / 2.205;
        m = (f + (i/12))/3.3281;
        bmi = kg / (m*m);

        System.out.println("Your BMI is: "+ bmi);

        boolean compare = !(bmi > 18.5 || bmi < 24.9);
        if (compare == false){
            System.out.println("Be careful");
        }
    }
}
