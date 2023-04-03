package homework18;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Vocabulary> map1 = new HashMap<>();
        map1.put("Кіт", new Vocabulary("Cat","猫", "Katze"));
        map1.put("Пес",new Vocabulary("Dog","犬","Hund"));
        map1.put("Перекладач",new Vocabulary("Translator", "翻訳者","Übersetzer"));
        map1.put("Війна",new Vocabulary("War","戦争","Krieg"));
        map1.put("Україна",new Vocabulary("Ukraine","ウクライナ","Ukraine"));
        map1.put("Місто",new Vocabulary("Town","街","Stadt"));
        map1.put("Мапа",new Vocabulary("Map","地図","Karte"));
        map1.put("Автомобіль",new Vocabulary("Car","車","Auto"));
        map1.put("Школа",new Vocabulary("School","学校","Schule"));
        map1.put("Мова",new Vocabulary("Language","言語","Sprache"));

        for (String s : map1.keySet()) {
            System.out.println(s + " translation is: " + map1.get(s));
        }
    }
}
