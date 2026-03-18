import java.util.Scanner;
public class App {
public static void main(String[] args) throws Exception {
Scanner in = new Scanner(System.in);
// Tehtävä 1.
// Kysy käyttäjän nimi ja tulosta se tyylillä:
// "Hei mikä sinun nimesi on?"
// -> Käyttäjä syöttää nimen
// "Sinun nimesi on  ____ ."
// Tehtävä 2.
// Kysy käyttäjän nimi ja tulosta se samalla tavalla kuin tehtävässä
// 1. Kuitenkin jo käyttäjä antaa tyhjän vastauksen, eli ei syötä mitään tulosta "Error".


String nimi = " "; // Tyhjä muuttuja nimi.
System.out.println("Hei, mikä sinun nimesi on?"); // Kysytään käyttäjältä nimeä
nimi = in.nextLine(); // Käyttäjä voi syöttää nimensä muuttujaan nimi
if(nimi.equals("")){ // Tarkistetaan onko nimi tyhjä, jos on tehdään if lauseka
    System.out.println("ERROR"); // Tulostetaan ERROR
}else{ // Jos nimi EI ole tyhjä, tulostetaan alkuperäinen teksti.
System.out.println("Sinun nimesi on " + nimi); // Tulostetaan " " sisällä oleva lause ja lisätään + merkillä sen perään muuttuja nimi.
}


// Tehtävä 3.
// Kysy käyttäjän nimi ja sen jälkeen käyttäjän ikä.
// Tulostus tulisi olla:
// "Hei mikä sinun nimesi on?"
// -> Käyttäjä syöttää nimen
// "Kuinka vanha olet?"
// -> Käyttäjä syöttää ikänsä
// "Sinun nimesi on  ____  ja olet ____ vanha."

String nimi = " ";
int ika = 0;
System.out.println("Hei mikä sinun nimesi on?");
nimi = in.nextLine();
System.out.println("Kuinka vanha olet?");
ika = Integer.parseInt(in.nextLine()); // Integer.parseInt(), muuttaa String tyypin int tyypiksi.
System.out.println("Sinun nimesi on " + nimi + " ja olet " + ika + " vanha");

// Tehtävä 4
// Kysy käyttäjältä kaksi numeroa. Tulosta niiden yhteenlaskun summa.
// "Anna ensinmäinen luku"
// -> Käyttäjä syöttää luvun.
// "Anna toinen luku"
// -> Käyttäjä syöttää luvun
// "Yhteenlaskun tulos on ____"

int luku1 = 0;
int luku2 = 0;
System.out.println("Hei, anna minulle luku");
luku1 = Integer.parseInt(in.nextLine());
System.out.println("anna minulle toinen luku");
luku2 = Integer.parseInt(in.nextLine());
int summa = luku1 + luku2;
System.out.println("Yhteenlaskun tulos on " + summa);


// Tehtävä 5
// Kysy käyttäjältä kaksi numeroa. Tulosta niiden yhteenlaskun summa.
// Tulostetaan myös kaava millä se on laskettu!!!
// "Anna ensinmäinen luku"
// -> Käyttäjä syöttää luvun.
// "Anna toinen luku"
// -> Käyttäjä syöttää luvun
// " __ + __ = __"
int luku1 = 0;
int luku2 = 0;
System.out.println("Anna minulle luku");
luku1 = Integer.parseInt(in.nextLine());
System.out.println("Anna minulle toinen luku");
luku2 = Integer.parseInt(in.nextLine());
int summa = luku1 + luku2;
System.out.println(luku1 + "+" + luku2 + "=" + summa);
    }
}
