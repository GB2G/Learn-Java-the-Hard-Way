public class ArrayIntro {
    public static void main(String[] args) {
        String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        String[] stars = {"white", "red", "blue", "giant", "dwarf "};

        for ( String p : planets ){
            System.out.println( p + "\t" + p.toUpperCase());
        }

        System.out.println("\nDifferent stars:");

        for ( String s : stars ){
            System.out.println( s + ":\t"+ s.toUpperCase());
        }
    }
}
