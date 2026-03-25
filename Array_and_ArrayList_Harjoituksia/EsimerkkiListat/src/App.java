import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> oppilaidenIka = new ArrayList<Integer>(); // Alustetaan Lista
        oppilaidenIka.add(25); // Lisätään Indexiin0 arvo 25
        oppilaidenIka.add(36); // Lisätään Indexiin1 arvo 36
        oppilaidenIka.add(102); // Lisätään Indexiin2 arvo 102

        System.out.println(oppilaidenIka.get(0)); // .get avulla tulstetaan yksittäinen arvo

        for(int i = 0; i < oppilaidenIka.size(); i++){ // .size() SAMA KUIN .length
            System.out.println(oppilaidenIka.get(i)); // Tulostetaan kaikki.
        }


    }
}
