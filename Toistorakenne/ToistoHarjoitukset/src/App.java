public class App {
    public static void main(String[] args) throws Exception {
// Tehtävä 1:
// Tee koodi, joka tulostaa numerot väliltä 0 ja 4. Käytä for looppia.
// Lopputulos pitäisi näyttää tältä:
// 0
// 1
// 2
// 3
// 4
        System.out.println("Tehtävä 1");
        System.out.println(" "); // Tyhjä rivi terminaliin. (Ei vaikuta koodiin)
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println(i);
        }
        System.out.println(" "); // Tyhjä rivi terminaliin. (Ei vaikuta koodiin)

// Tehtävä 2:
// Tee koodi joka tulostaa numerot välillä 10 ja 20. Käytä for looppia.
// Lopputulos pitäisi näyttää tältä:
// 10
// 11
// 12
// 13
// 14
// 15
// 16
// 17
// 18
// 19
// 20
        System.out.println("Tehtävä 2");
        System.out.println(" "); // Tyhjä rivi terminaliin. (Ei vaikuta koodiin)
        for(int i = 10 ; i < 21 ; i++) {
            System.out.println(i);
        }
        System.out.println(" "); // Tyhjä rivi terminaliin. (Ei vaikuta koodiin)

// Tehtävä 3:
// Tee koodi, joka tulostaa numerot 0 ja 20 välillä, mutta tulostaa ainoastaan numerot 5,16 ja 20. Käytä for-loop
// Lopputulos pitäisi näyttää tältä:
// 5
// 16
// 20
        System.out.println("Tehtävä 3");
        System.out.println(" "); // Tyhjä rivi terminaliin. (Ei vaikuta koodiin)
        for(int i = 0 ; i < 21 ; i++){
            if (i == 5 || i == 16 || i == 20) {
                System.out.println(i);
            }
        }
        System.out.println(" "); // Tyhjä rivi terminaliin. (Ei vaikuta koodiin)

// Tehtävä 4:
// Tee koodi joka tulostaa sanan "loop" viisi kertaa. Käytä for loop.
// Lopputulos pitäisi näyttää tältä:
// loop
// loop
// loop
// loop
// loop
        System.out.println("Tehtävä 4");
        System.out.println(" "); // Tyhjä rivi terminaliin. (Ei vaikuta koodiin)
        for(int i = 0 ; i < 5 ; i++) {
            System.out.println("loop");
        }
        System.out.println(" "); // Tyhjä rivi terminaliin. (Ei vaikuta koodiin)

// Tehtävä 5:
// Tulosta numerot 1 ja 5 välillä käyttäen Do-While looppit tai While-looppia.
// Lopputulos pitäisi näyttää tältä:
// 1
// 2
// 3
// 4
// 5
        System.out.println("Tehtävä 5");
        System.out.println(" "); // Tyhjä rivi terminaliin. (Ei vaikuta koodiin)
        // Do-while
        int i = 0;
        do {
            i++;
            System.out.println(i);
        } while (i < 5);

        // While
        int j = 0;
        while(j <5){
            j++;
            System.out.println(j);
        }

    
        System.out.println(" "); // Tyhjä rivi terminaliin. (Ei vaikuta koodiin)

// Tehtävä 6:
// Tee koodi joka tulostaa 10 kappaletta " * " symboolia samalla riville.
// Käytä Do-While looppia.
// (Vinkki käytä System.out.print() äläkä System.out.println())
// Lopputulos pitäisi näyttää tältä:
// **********
        System.out.println("Tehtävä 6");
        System.out.println(" "); // Tyhjä rivi terminaliin. (Ei vaikuta koodiin)
        int r = 0;
        do {
            System.out.print("*");
            r++;
        } while (r < 10);
        
        System.out.println(" "); // Tyhjä rivi terminaliin. (Ei vaikuta koodiin)
// Tehtävä 7:
// Tee koodi joka tulostaa sanan Kierros ja sen perässä kierrosmäärän.
// Käytä for looppia.
// Lopputulos pitäisi näyttää tältä:
// Kierros 1
// Kierros 2
// Kierros 3
// Kierrots 4
// Kierros 5
// Kierros 6
// Kierros 7
// Kierros 8
// Kierros 9
// Kierros 10
        System.out.println("Tehtävä 7");
        System.out.println(" "); // Tyhjä rivi terminaliin. (Ei vaikuta koodiin)


        for(int k = 0; k < 10; k++){
            int m = 1 + k;
            System.out.println("Kierros " + m);
        }


        System.out.println(" "); // Tyhjä rivi terminaliin. (Ei vaikuta koodiin)
    }
}
