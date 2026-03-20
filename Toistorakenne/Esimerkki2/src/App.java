public class App {
    public static void main(String[] args) throws Exception {

        // Do While loop
        String paiva = "";
        do {
            System.out.println("Herää");
            System.out.println("Mene kouluun");
            System.out.println("Mene kotiin");
            System.out.println("Nukkumaan");
        } while (paiva.equals("arki"));

        // For Loop
        for(int i = 0; i < 5; i++){
        int j = 1 + i;
        System.out.println(j);
        }

        // While Loop
        int ruokaMaassa = 0;
        while(ruokaMaassa < 1) {
            System.out.println("Voit nostaa ruuan ja syödä");
            ruokaMaassa++;
        }


        for(int waterCooler = 1 ; waterCooler < 1 ; waterCooler++) {
            System.out.println("Heyo");
        }
}
}
