import java.security.MessageDigest;
import java.util.Formatter;
import java.util.Scanner;

public class PasswordDigest {
   public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       String pw;

       MessageDigest digest = MessageDigest.getInstance("SHA-256");
            //aussi : MD5, SHA-1, SHA-224, SHA-256, SHA-384, SHA-512

            System.out.print("Password: ");
            pw = sc.nextLine();

            digest.update( pw.getBytes("UTF-8"));

            Formatter bytesToHex = new Formatter();
            for (byte b : digest.digest()) {
               bytesToHex.format("%02x", b);

            }

            System.out.println( bytesToHex );
   } 
}
