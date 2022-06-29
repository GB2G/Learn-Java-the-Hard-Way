public class NestingLoops {
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"
        for ( int n = 1; n <= 3; n++ ){
            {for ( char c='A'; c <= 'E'; c++ ){
                System.out.println( c + " " + n );
            }// Le variable n change plus vite que le variable c
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ ){
            for ( int b=1; b <= 3; b++ ){
                System.out.print( "(" + a + "," + b + ") " );
            } //Ca liste les lettres avec leurs lettres et la les entres parentheses pour chaque cas separe
            System.out.println("Hello");//Chaque ligne de parentheses termine avec le string dans le print ln
        }// Au lieu d'afficher tous les lettres sur une ligne, ca fait un retour a la ligne pour chacune

        System.out.println("\n");
    }
}
}