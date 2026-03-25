public class App {
    public static void main(String[] args) throws Exception {
        int arvot[] = {3, 6, 1};
        int summa = 0;
        int esimerkki = 0;

        for(int i = 0; i < arvot.length; i++){
        summa = summa + arvot[i]; // Joka kierros summaa. eli eka 3, sitten 9, sitten 10.
        esimerkki += arvot[i]; // Tekee saman kun ylempi
    }
        System.out.println(summa);
        System.out.println(esimerkki);
    }
}
// Tee Array joka sisältää seuraavat arvot:
// 3
// 6
// 1
// Laske Arrayn arvot yhteen ja tulosta niiden summa
// (Eli 3+6+1)