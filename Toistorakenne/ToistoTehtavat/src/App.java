import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
// Tehtävä 1:
// Tee koodi, joka ensin kysyy käyttäjältä "Mikä on ensimmäinen numero?"
// ja sitten "Mikä on toinen numero?". Sitten se tulostaa kaikki numerot niiden väliltä.
// Esimerkiksi jos käyttäjä antaa luvut 3 ja 6.
// Lopputulos näyttäisi tältä:
// Ensimmäinen numero?
// 3
// Toinen numero?
// 6
// 3
// 4
// 5
// 6
        Scanner in = new Scanner (System.in); // Tehdään meidän scanneri "in", joka kysyy käyttäjältä tietoa
        System.out.println("Please give me a number."); // Kysytään käyttäjältä numeroa
        int vastaus1 = Integer.parseInt(in.nextLine()); // Tallennetaan käyttäjän vastaus muuttujaan vastaus1
        // Integer.parseInt(), muuttaa string tyypin int tyypiksi
        System.out.println("Please give me another number."); // Kysytään käyttäjältä numeroa
        int vastaus2 = Integer.parseInt(in.nextLine());
        System.out.println(" "); // Tyhjä väli terminaliin. Ei vaikuta koodiin.
        // for-loop tapa
        for(int i = vastaus1 ; i <= vastaus2 ; i++) {
            System.out.println(i);
        }

        System.out.println(" "); // Tyhjä väli terminaliin. Ei vaikuta koodiin.
        // do-while tapa
        do {
            System.out.println(vastaus1);
            vastaus1++;
        } while (vastaus1 <= vastaus2);
    }
}
