public class App {
    public static void main(String[] args) throws Exception {

        String tekija = "Roni";
        int luku1 = 4;
        int luku2 = 6;
        double luku3 = 4.0;
        double luku4 = 6.0;

        System.out.println("Hei, olen tulostin-ohjelma");
        System.out.println("Ohjelman tekija: " + tekija);

        // "Luku1 muuttujan arvo on 4"
        System.out.println("Luku1 muuttujan arvo on " + luku1);
        System.out.println("Luku2 muuttujan arvo on " + luku2);
        // * kertolasku ( int tulo )
        int tulo = 0;
        tulo = luku1 * luku2;
        System.out.println(luku1 + "*" + luku2 + "=" + tulo);
        // - miinuslasku ( int erotus )
        int erotus = 0;
        erotus = luku1 - luku2;
        System.out.println(luku1 + "-" + luku2 + "=" + erotus);
        // + pluslasku ( int summa )
        int summa = 0;
        summa = luku1 + luku2;
        System.out.println(luku1 + "+" + luku2 + "=" + summa);
        // / jakolasku ( jako )
        double jako = 0.0;
        jako = luku3 / luku4;
        System.out.println(luku1 + "/" + luku2 + "=" + jako);
    }
}
