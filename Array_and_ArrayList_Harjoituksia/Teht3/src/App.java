public class App {
    public static void main(String[] args) throws Exception {
        String [] color;
        color = new String [3];
        color[0] = "Green";
        color[1] = "Blue";
        color[2] = "Yellow";

        System.out.println(color[2]);

        for(int i = 0; i<color.length;i++){
            int j = 1 + i; // Tehdään muuttuja j, jonka avulla saame X. arvon värin eteen.
            System.out.println(j + "." + color[i]);
        }
    }
}
// Tehtävä 3:
// Tee Array samoilla arvoilla kun tehtävässä 1.
// Green, Blue, Yellow
// 1. Tulosta toinen indexi
// 2. Tulosta koko Array niin että tulostuu myös numero mones arvo Arrayssa se on.
// Esimerkki:
// 1. Green
// 2. Blue
// 3. Yellow