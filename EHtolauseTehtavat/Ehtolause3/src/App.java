public class App {
    public static void main(String[] args) throws Exception {
// Tehtävä 3. Tee kolme muuttujaa - nimi1, nimi2 ja nimi3
        String nimi1 = "Pekka";
        String nimi2 = "Jarno";
        String nimi3 = "Pekka";
// 1 - Tutki, onko nimi1 ja nimi2 samoja
// if (pekka = jarno)
// .equals() on sama kuin ==
        if(nimi1.equals(nimi2)){
            System.out.println("Nimet ovat samoja");
        }
// 2 - Tutki, onko nimi1 ja nimi2 eri
        if(!nimi1.equals(nimi2)){
            System.out.println("Nimet ovat eri");
        }
// 3 - Tutki, onko nimi1 ja nimi2 samoja.
// Jos ei ole, tutki onko nimi1 ja nimi3 samoja.
        if(nimi1.equals(nimi2)){
            System.out.println("1 ja 2 Samoja");
        } else if (nimi1.equals(nimi3)){
            System.out.println("1 ja 3 samoja.");
        }
    }
}
