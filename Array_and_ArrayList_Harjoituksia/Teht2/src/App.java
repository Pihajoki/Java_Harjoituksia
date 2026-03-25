import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String [] lauseet; // Alustetaan Array
        lauseet = new String [4]; // Määritellään Array 4:lle arvolle
        lauseet[0] = "Actions speak louder than words."; // Syötetään indeksiin 0 arvo1
        lauseet[1] = "A barking dog never bites."; // Syötetään indeksiin 1 arvo2
        lauseet[2] = "A penny saved is a penny earned."; // Syötetään indeksiin 2 arvo3
        lauseet[3] = "All things come to those who wait."; // Syötetään indeksiin 3 arvo4

        Scanner in = new Scanner(System.in); // Tehdään Scanneri
        System.out.println("Give me a number between 1-4"); // Kysytään käyttäjältä arvoa
        int vastaus = Integer.parseInt(in.nextLine()); // Tallennetaan käyttäjän antama arvo muuttujaan vastaus
        System.out.println(lauseet[vastaus - 1]); // Tulostetaan indeksi, jonka käyttäjä antaa. HUOM -1 tulee tehdä jotta saadaan oikea indeksi.

    }
}

// Tehtävä 2.
// Tee array ja aseta sille seuraavat lauseet:
// Actions speak louder than words.
// A barking dog never bites.
// A penny saved is a penny earned.
// All things come to those who wait.
// 1. Pyydä käyttäjää kirjoittamaan numero 1 & 4 välillä.
// 2. Ohjelman tulisi tulostaa vastaava lause.
// Tulostus esimerkki:
// Valitse numero 1-4.
// 3
// A penny saved is a penny earned.