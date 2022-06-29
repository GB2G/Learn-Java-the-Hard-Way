
import java.util.Scanner;

public class Sequencing {
    // The code is broken until I fix it
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double price, salesTax, total;

        System.out.print("How much is the purchase price? ");
        price = sc.nextDouble();

        salesTax = price * 0.0825;
        total = price + salesTax;


        System.out.println("Item price: \t"+ price);
        System.out.println("Sales tax: \t"+ salesTax);
        System.out.println("Total cost: \t"+ total);

    }
}
// Problem was with where the double variables were situated. Price needs to be determined before the calculations are made.
// Yes the error message makes sense as we do not have a value for price that can be used to din the othe doubles
// You need to move the line that defines price to before the calculations that need them
// 