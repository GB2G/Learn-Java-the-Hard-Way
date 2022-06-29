import java.io.PrintWriter;
import java.util.Scanner;

public class RecieptRevisited {
    public static void main(String[] args) throws Exception {
        PrintWriter fileout = new PrintWriter("reciept.txt");
        Scanner sc = new Scanner(System.in);
        Double gallon, cost, price = 3.459;

        System.out.println("Gas price is $3.459 per gallon");
        System.out.println("How many gallons would you like?");
        gallon = sc.nextDouble();

        cost = gallon*price;


        fileout.println("+--------------------------+");
        fileout.println("|                          |");
        fileout.println("|       Corner Store       |");
        fileout.println("|                          |");
        fileout.println("|  2014-06-25    04:38PM   |");
        fileout.println("|                          |");
        fileout.println("|  Gallons:      "+ gallon);
        fileout.println("|  Price/gallon: $3.459    |");
        fileout.println("|                          |");
        fileout.println("|  Fuel total:   $"+ cost);
        fileout.println("|                          |");
        fileout.println("+--------------------------+");
        fileout.close();

    }
}
