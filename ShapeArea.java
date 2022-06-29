import java.util.Scanner;

public class ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double area = 0;

        System.out.print("Shape Area Calculator version 0.1");
        System.out.println(" (c) 2015 LJtHW Sample Output, Inc.");

        do{
            System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("1) Triangle");
            System.out.println("2) Circle");
            System.out.println("3) Rectangle");
            System.out.println("4) Quit");
            System.out.println("5) Square");
            System.out.print("> ");
            choice = sc.nextInt();

            if (choice == 1){
                System.out.print("\nBase: ");
                int b = sc.nextInt();
                System.out.print("\nHeight: ");
                int h = sc.nextInt();
                area = computeTriangleArea(b, h);
                System.out.println("The area is "+ area);
            }

            else if (choice == 2){
                System.out.print("\nRadius: ");
                int radius = sc.nextInt();
                area = computeCircleArea(radius);
                System.out.println("The area is: "+ area);
            }

            else if (choice == 3){
                System.out.print("\nLength: ");
                int q = sc.nextInt();
                System.out.print("Width: ");
                int w = sc.nextInt();
                System.out.println("The area is "+ computeRectangleArea(q,w));
            }
            else if (choice == 5){
                System.out.print("Length of one side: ");
                int s = sc.nextInt();
                System.out.println("The area is "+ computeSquareArea(s));  
            }
            
            else if (choice != 4){
                System.out.println("ERROR!");
            }

            
        }
        while (choice != 4);
    }


public static double computeTriangleArea( int base, int height ){
    double A;
    A = 0.5*base*height;
    return A;
}

public static double computeCircleArea( int radius ){
    double A;
    A= Math.PI*radius*radius;
    return A;
}

public static int computeRectangleArea( int length, int width ){
    return (length*width);
}

public static int computeSquareArea(int s){
    int A;
    A = s*s;
    return A;
}

}
