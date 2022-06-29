import static java.lang.System.*;

public class OverlyComplexFlag {
    public static void main(String[] args) {
        printTopHalf();

        print48Colons();
        print48Ohs();
        print48Colons();
        print48Ohs();
        print48Colons();
        print48Ohs();
    }

    public static void print48Colons(){
        out.println("|::::::::::::::::::::::::::::::::::::::::::::|");
    }

    public static void print48Ohs(){
        out.println("|oooooooooooooooooooooooooooooooooooooooooooo|");
    }

    public static void print29Colons(){
        out.println("|:::::::::::::::::::::::::::::|");
    }

    public static void printPledge(){
        out.println("I pledge alleigance to the flag");
    }
    
    public static void print29Ohs(){
        out.println("|ooooooooooooooooooooooooooooo|");
    }

    public static void print6Stars(){
        out.print("|  * * * * * * ");
    }

    public static void print5Stars(){
        out.print("|   * * * * *  ");
    }

    public static void printSixStarLine(){
        print6Stars();
        print29Ohs();
    }

    public static void printFiveStarsLine(){
        print5Stars();
        print29Ohs();

    }

    public static void printTopHalf(){
        out.println(" ________________________________________________");
        //1 espace et 48 underscore
        printSixStarLine();
        printFiveStarsLine();
        printSixStarLine();
        printFiveStarsLine();
        printSixStarLine();
        printFiveStarsLine();
        printSixStarLine();
    }
}
