class Address{
    String street;
    String city;
    String state;
    int zip;
    String zipCAN;
}

public class MailingAddresses {
    public static void main(String[] args) {
        Address uno, dos, tres, me;

        uno = new Address();
        uno.street = "191 Marigold Lane";
        uno.city = "Miami";
        uno.state = "FL,";
        uno.zip = 33179;

        dos = new Address();
        dos.street = "3029 Losh Lane";
        dos.city = "Crafton";
        dos.state = "PA,";
        dos.zip = 15205;

        tres = new Address();
        tres.street = "2693 Hannah Street";
        tres.city = "Hickory";
        tres.state = "NC,";
        tres.zip = 28601;

        me = new Address();
        me.street = "41 Rialto Way";
        me.city = "Ottawa";
        me.state = "ON,";
        me.zipCAN = "K1T4B3";

        System.out.println(uno.street);
        System.out.println(uno.city + " " + uno.state + " " + uno.zip);
        System.out.println("\n"+dos.street);
        System.out.println(dos.city + " " + dos.state + " " + dos.zip);
        System.out.println("\n" + tres.street);
        System.out.println(tres.city + " " + tres.state + " " + tres.zip);
        System.out.println("\n" + me.street);
        System.out.println(me.city + " " + me.state + " " + me.zipCAN);

    }
    
}
