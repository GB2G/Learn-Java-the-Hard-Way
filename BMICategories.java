import java.util.Scanner;

public class BMICategories {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bmi, kg, m, height;
        int feet, inches;

        System.out.println("Enter your height in feet only: ");
        feet = sc.nextInt();

        System.out.println("Enter your height in inches only: ");
        inches = sc.nextInt();

        height = (feet + (inches/12));
        System.out.println("Your height in feet is: "+ height);

        m = height/3.281;
        System.out.println("Your height in meters is "+ m);

        System.out.println("Enter your weight in kilograms: ");
        kg = sc.nextDouble();
        System.out.println("You weigh "+ kg + "kg");

        bmi = kg/(Math.pow(m,2));
        System.out.println("Your BMI is: "+ bmi);

        System.out.println("BMI category: ");
        if (bmi < 15.0){
            System.out.println("very severely underweight");
        }

        else if (bmi <= 16.0){
            System.out.println("severely underweight");
        }

        else if (bmi < 18.5){
            System.out.println("underweight");
        }

        else if (bmi < 25.0){
            System.out.println("normal weight");
        }

        else if (bmi < 30){
            System.out.println("overweight");
        }

        else if (bmi < 35.0){
            System.out.println("moderately obese");
        }

        else if (bmi < 40.0){
            System.out.println("severely obese");
        }

        else {
            System.out.println("very severely/\"morbidly\" obese");
        }






    }
    
}
