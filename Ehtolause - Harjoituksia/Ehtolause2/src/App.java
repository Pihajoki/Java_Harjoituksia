public class App {
    public static void main(String[] args) throws Exception {
// Tehtävä 2. Tee kolme muuttujaa - luku1, luku2 ja luku3. Anna luvuille numeeriset arvot.
        int luku1 = 3;
        int luku2 = 7;
        int luku3 = 3;
// 1 - Tutki, onko luku1 ja luku2 yhtä suuria TAI luku2 ja luku3 yhtä suuria.
            // 3 = 7 OR 7 = 3
            // || tarkoittaa TAI / OR
        if(luku1 == luku2 || luku2 == luku3){
            System.out.println("Jotkin luvuista ovat samoja");
        }
// 2 - Tutki, onko luku1 suurempi kuin luku2 JA luku1 yhtä suuri kuin luku3.
        // 3 > 7 JA 3 = 3
        // && tarkoittaa JA / AND
        if(luku1 > luku2 && luku1 == luku3){
            System.out.println("Luku on suurempi ja sama");
        }
// 3 - Tutki, onko luku1 ja luku2 ja luku3 yhtä suuria.
        // luku1 = luku2 JA luku2 = luku3
        // 3 = 3 JA 3 = 3
        if (luku1 == luku2 && luku2 == luku3) {
            System.out.println("Kaikki luvut ovat samoja");
        }
// 4 - Tutki, onko luku1 suurempi kuin luku2.
// Jos ei ole, tutki onko luku2 suurempi kuin luku3.
        if(luku1 > luku2){
            System.out.println("Luku 1 on suurempi.");
        } else if(luku2 > luku3) {
            System.out.println("Luku2 on suurempi");
        }
// 5 - Tutki, onko luku1 ja luku2 yhtä suuria.
// Jos ei ole, tutki, onko luku1 ja luku3 yhtä suuria.
        if(luku1 == luku2){
            System.out.println("Luku1 ja luku2 ovat samoja");
        } else if(luku1 == luku3){
            System.out.println("Luku1 ja Luku3 ovat samoja");
        }
}
}
