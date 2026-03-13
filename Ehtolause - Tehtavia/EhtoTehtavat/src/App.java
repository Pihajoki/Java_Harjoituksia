public class App {
    public static void main(String[] args) throws Exception {
// Tehtävä 1.
// - Luo muuttuja, jonka tyyppi on int ja sen arvo on 120.
        int luku120 = 120;
// - Tee if-lauseke, joka tarkistaa onko muuttujan arvo enemmän kuin 100.
        if(luku120 > 100){
            // -Jos on se on, tulosta "120 on suurempi kuin 100."
            System.out.println(luku120 + " on suurempi kuin 100.");
        }



// Tehtävä 2.
// -Luo KAKSI muuttujaa, joiden tyyppi on int ja aseta molemmille SAMA arvo. (esimerkiksi 7)
        int luku1 = 4;
        int luku2 = 4;
// -Tee if-lauseke joka tarkistaa ovatko numerot samat
        if(luku1 == luku2){
            // jos ovat tulosta "numerot ovat samoja"
            System.out.println("Luvut ovat samoja.");
        }


// Tehtävä 3.
// -Luo kaksi muuttujaa, joiden tyypit ovat String.
// - Toiselle muuttujalle aseta arvo "iOS" ja toiselle "Android"
        String ios = "iOS";
        String android = "Android";
// - Tulosta muuttujien arvot
        System.out.println(ios);
        System.out.println(android);
// - Tee if-Lause, joka tarkistaa onko muuttujilla sama arvo. (Käytä .equals() komentoa)
// OPTIO 1
        if(ios.equals(android)){
            System.out.println("Arvot ovat samat.");
        } else {
            // - Jos ne eivät ole samoja tulosta: "Arvot eivät ole samoja"
            System.out.println("Arvot eivat ole samoja.");
        }
// OPTIO 2
        if(!ios.equals(android)){
            // - Jos ne eivät ole samoja tulosta: "Arvot eivät ole samoja"
            System.out.println("Arvot eivat ole samoja.");
        }


// Tehtävä 4.
// -Luo kolme muuttujaa, joiden tyyppi on int
// -Anna kaikille sama arvo, kuten 3.
        int arvo1 = 3;
        int arvo2 = 3;
        int arvo3 = 3;
//-Tee if-Lause, joka tarkistaa että kaikki numerot ovat samoja.
        if(arvo1 == arvo2 && arvo2 == arvo3){
            // -Jos kaikki ovat samoja tulosta "Kaikki numerot ovat samoja"
            System.out.println("Kaikki luvut ovat samoja.");
        }
    }
}
