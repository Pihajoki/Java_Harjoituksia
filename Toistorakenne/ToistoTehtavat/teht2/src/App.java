import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
// Tehtävä 2:
// Tee arvauspeli.
// Ensin koodi kysyy käyttäjältä "Arvaa nimeni", jos käyttäjä arvaa oikein tulostuu
// "Osuit oikeaan" ja kysely loppuu.
// Jos vastaus on väärin, jatka kysymistä.
// Tee vielä vaihtoehto, jos käyttäjä kirjoittaa "stop" niin arvailu loppuu.
// Käytä tähän break; komentoa.
// Lisää vielä aivan loppuun tulostus:
// "Arvasit 3 kertaa" (Jos siis olisit arvannut kolmannella nimen.)
// Lopputulos tulisi näyttää tältä:
// Arvaa nimeni
// Jarno
// Arvaa nimeni
// Dimi
// Arvaa nimeni
// Henna
// Osuit oikeaan!
// Arvasit 3 kertaa.

    String oikeaNimi = "jeff"; // Annetaan oikea nimi, jota yritetään arvata
    String arvaus = " "; // Tämä on scanneria varten, johon tallennetaan nimi.
    int laskuri = 0; // Laskee arvauksien määrän

    do {
    System.out.println("Hei, arvaa minun nimeni. Jos haluat lopettee pelin kirjoita -> stop");
    arvaus = in.nextLine(); // Käytäjän arvaus tallennetaan arvaus muuttujaan
        if(arvaus.equals("stop")){ // JOs käyttäjä kirjoittaa "Stop" tehdään tämä if lause
            break; // Tämä lopettaa koodin kesken kaiken.
        }
        laskuri++; // Lisätään laskuriin 1, eli saadaan tietää monta kertaa on arvattu
    } while (!arvaus.equals(oikeaNimi)); // Tätä Do-While jatketaan niin kauan kun vastaus on väärin. HUOM ! edessä

    if(arvaus.equals(oikeaNimi)){ // jos arvaus on oikein
        System.out.println("Osuit oikeaan!"); // Tulostetaan "Osuit oikeaan"
    }

    System.out.println("Arvasit: " + laskuri + " kertaa"); // Lopuksi tulostetaan kuinka monta kertaa olet arvannut.
    }
}
