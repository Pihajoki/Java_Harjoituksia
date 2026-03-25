public class App {
    public static void main(String[] args) throws Exception {
    String[] huonekalut = {"Kirjahylly", "Sohva", "Tuoli", "Kaappi"};

    for(int i=0; i < huonekalut.length; i++){
        if(huonekalut[i].equals("Sohva")){ // String tyypin Arrayta voi verrata tekstiin kuten normaalia String muuttujaa.
            System.out.println("On sohva!");
        }
    }
    }
}


// Lisää alla olevaan ohjelmaan if-lauseke, joka tarkistaa onko Sohva huonekaluissa
