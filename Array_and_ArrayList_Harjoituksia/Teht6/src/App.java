import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Kia");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Renault");
        // 2.
        for(int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        // 3. Lisätään indexiin 1 "Ford", jonka jälkeen Tesla siirtyy indexiin 2.
        cars.add(1, "Ford");
        // 4. Poistetaan Indexi 2. Tesla, jonka jälkeen indexi 2 on BMW.
        cars.remove(2);
        // 5. Vaihdetaan indexiin 2 Audi.
        cars.set(2, "Audi");
        // 6. TÄMÄ ON OTSIKKO
        System.out.println("Muokattu lista");
        // 7. Tulstetaan koko lista
        for(int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}
// (Muista lisätä import java.util.ArrayList;)
// 1. Tee ArrayList alla olevalla koodilla.
// 2. Tulosta koko Lista
// 3. Lisää uusi auto "Ford" Kian jälkeen
// 4. Poista Tesla
// 5. Vaihda BMW:n tilalle Audi
// 6. Tulosta "Muokattu lista"
// 7. Tulosta koko Lista