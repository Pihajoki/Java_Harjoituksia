public class App {
    public static void main(String[] args) throws Exception {
// 1 - Tutki, onko luku1 yhtä suuri kuin luku2.
// 2 - Tutki, onko luku1 suurempi kuin luku2.
// 3 - Tutki, onko luku1 suurempi tai yhtä suuri kuin luku2.
// 4 - Tutki, onko luku1 eri suuri kuin luku2.
        int luku1 = 15;
        int luku2 = 15;
        if (luku1 == luku2) { // Onko 10 = 15?
            System.out.println("Luvut ovat samoja!");
        }
        if (luku1 > luku2) { // Onko 10 > 15 ?
            System.out.println("Luku1 on suurempi!");
        }
        if (luku1 >= luku2) { // Onko 10 > 15 tai 10 = 15 ?
            System.out.println("Luku1 on joko suurempi tai yhtäsuuri kuin luku2");
        }
        if (luku1 != luku2) { // 10 ei ole 15
            System.out.println("Luvut ovat eri suuria.");
        }
    }
}
