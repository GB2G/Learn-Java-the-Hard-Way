import static java.lang.System.*;

public class DrapeauTropComplexe {
    public static void main(String[] args) 
    {
        rouge();
        afficheBordHorizontal();
        afficheBandeRouge();
        afficheBandeBlanche();
        afficheFeuille();
        afficheBandeBlanche();
        afficheBandeRouge();
        afficheBordHorizontal();
        blanc();
        
    }
    
    public static void rouge()
    {
        out.print( "\u001B[31m" ); // change la couleur du texte à la console
    }

    public static void blanc()
    {
        out.print( "\u001B[0m" ); // remet la couleur du texte à la valeur par défaut
    }
    
    public static void afficheBandeBlanche()
    {
        blanc();
        out.println( "|                            |" );       
    }

    public static void afficheBandeRouge()
    {
        rouge();
        int rangs = 5;
        while ( rangs > 0 )
        {
            out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOO|" );
            rangs--;
        }
    }

    public static void afficheFeuille()
    {
        afficheBordGauche();
        out.print( "           .  A             " ); afficheBordDroitEtGauche(); 
        out.print( "          A HHh .           " ); afficheBordDroitEtGauche();
        out.print( "    .   AHHHHHH        .    " ); afficheBordDroitEtGauche();
        out.print( "     A AHHHHHHHl vHHHEb     " ); afficheBordDroitEtGauche();        
        out.print( "  ---|HHHHHHHHHHHHHHHHHE->  " ); afficheBordDroitEtGauche();        
        out.print( "     V VHHHHHHTl ^HHHLP     " ); afficheBordDroitEtGauche();        
        out.print( "    `   VHHHHHH        `    " ); afficheBordDroitEtGauche();        
        out.print( "          v HHT `           " ); afficheBordDroitEtGauche();        
        out.print( "           `  V             " ); afficheBordDroitEtGauche();
        
        out.print("\b"); // supprimer le bord Gauche de trop
    }

    public static void afficheBordHorizontal()
    {
        out.println( "+----------------------------+" );
    }

    public static void afficheBordGauche() 
    {
        blanc();
        out.print( "|" );
        rouge();
    }

    public static void afficheBordDroitEtGauche() 
    {
        blanc();
        out.println( "|" );
        afficheBordGauche();
    }

    public static void oCanada()
    {
        out.println( "Oh Canada, Terre de nos aïeux!" );
    }
}

