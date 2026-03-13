import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in); // Lisätään Scanneri
        int luku1 = 0; // Alustetaan tyhjä muuttuja ensinmäiselle luvulle
        int luku2 = 0; // Alustetaan tyhjä muuttuja toiselle luvulle
        System.out.println("Hey give me a number."); //  Kysytään käyttäjältä ensimmäinen luku
        luku1 = Integer.parseInt(in.nextLine()); // Lisätään kysytty luku lukuun1
        System.out.println("Hey give me another number."); // Kysytään käyttäjältä toinen luku
        luku2 = Integer.parseInt(in.nextLine()); // Lisätään kysytty luku lukuun2

        String laskutapa = " "; // Lisätään laskutapa
        System.out.println("How would you like this to be calculated?"); // Kysytään käyttäjältä miten hän haluaa laskea laskun
        System.out.println("Use: -, + or *"); // Kysytään käytetäänkö +, - vai *
        laskutapa = in.nextLine(); // Kysytään millät avalla lasku halutaan laskea
        if(laskutapa.equals("+")){ // tarkistetaan onko saatu tulos +
            int summa = luku1 + luku2; // Suoritetaan plus lasku
            System.out.println("Sum is " + summa); //  Tulostetaan laskun summan
        } else if (laskutapa.equals("-")){ // tarkistetaan onko saatu tulos -
            int erotus = luku1 - luku2; // Suoritetaan miinus lasku
            System.out.println("Subtraction is " + erotus); // Tulostetaan laskun erotus
        } else if (laskutapa.equals("*")){ // tarkistetaan onko saatu tulos *
            int tulo = luku1 * luku2; // Suoritetaan kerto lasku
            System.out.println("Multiplication is " + tulo); // Tulostetaan laskun tulo
        }


    }
}
