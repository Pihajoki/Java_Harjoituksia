// Adds a library so we can use User input.
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // 1.Määrittää että käytetään Scanneria.
        // 2. in on nimi meidän scannerille.
        // 3. Määritellään uusi Scanneri.
        // 4. Kerrotaan että "Systeemi" käyttää scanneria in.
        // 1.    2.        3.         4.
        Scanner in = new Scanner(System.in);

        // STRING TYYPIN KYSYMINEN (Teksti)
        String nimi = " "; // Tyhjä muuttuja nimi
        System.out.println("Hei, kertoisitko minulle nimesi?"); // Pyydetaan kayttajalta tietoa
        nimi = in.nextLine(); // User inputs their name
        System.out.println("Hei nimesi on: " + nimi); // We print the name back

        // INT TYYPIN KYSYMINEN (Numero)
        int luku1 = 0;
        System.out.println("Hei, anna luku?");
        luku1 = Integer.parseInt(in.nextLine());
        System.out.println(luku1 * 10);
    }
}
