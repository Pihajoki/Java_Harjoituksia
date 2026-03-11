public class App {
    public static void main(String[] args) throws Exception {
        // "Hei olen tulostin-ohjelma"
        // "Ohjelman tekijä: OmaNimi-muuttuja"
        // "Luku1-muuttujan arvo on X-muuttuja"
        // "Luku1-muuttujan arvo on Y-muuttuja"
        // "X * Y = Z"
        // "X + Y = Z"
        // "X - Y = Z"
        // "X / Y = Z"

        System.out.println("Hei, olen tulsostin-ohjelma");
        String nimi = "Roni";
        System.out.println("Ohjelman tekijä: " + nimi);
        int luku1 = 5;
        int luku2 = 2;
        System.out.println("Luvun1 arvo on " + luku1);
        System.out.println("Luvun2 arvo on " + luku2);
        int tulo = luku1 * luku2;
        int summa = luku1 + luku2;
        int erotus = luku1 - luku2;
        double jaettava1 = 5.0;
        double jaettava2 = 2.0;
        double jako = jaettava1 / jaettava2;

        System.out.println(luku1 + "*" + luku2 + "=" + tulo);
        System.out.println(luku1 + "+" + luku2 + "=" + summa);
        System.out.println(luku1 + "-" + luku2 + "=" + erotus);
        System.out.println(luku1 + "/" + luku2 + "=" + jako);
    }
}
