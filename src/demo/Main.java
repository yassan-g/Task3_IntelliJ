package demo;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> country = new HashMap<>();
        country.put("日本", 20);
        country.put("アルゼンチン", 1);
        country.put("ドイツ", 14);
        country.put("アメリカ合衆国", 13);

        System.out.println("ドイツのFIFAランキングは" + country.get("ドイツ") + "位");

        try {
            if(country.get("中国")==null){
                throw new ArrayIndexOutOfBoundsException();
            } else {
                System.out.println("日本のFIFAランキングは" + country.get("日本") + "位");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("存在しません");
        }
    }
}
