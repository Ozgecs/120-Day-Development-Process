package Gun1;

import java.util.ArrayList;
import java.util.List;

public class Soru_3_K {
    public static void main(String[] args){
        // Bir string listesinde en uzun kelimeyi bul.

        List<String> words = new ArrayList<>();

        words.add("java");
        words.add("spring");
        words.add("backend");
        words.add("microservice");
        words.add("api");
        words.add("architecture");

        // en uzun kelimeyi önce ilk değere eşitleyelim.

        String enUzunKelime = words.get(0);

        for (int i = 0; i < words.size(); i++){
            String word = words.get(i);

            if (word.length() > enUzunKelime.length()){
                enUzunKelime = word;
            }
        }
        System.out.println("En uzun kelime: " + enUzunKelime);


        // stream ile çözüm

        String enUzun = words.stream()
                .max((a,b) -> Integer.compare(a.length(), b.length()))
                .orElse(null);


        System.out.println(enUzun);

        // Burada önemli bir stream sorusu
        // Bir listenin çiftlerini almak ve karelerini hesaplamak.

        List<Integer> result = new ArrayList<>();
        for (int j = 0; j <= 20; j++){
            result.add(j);
        }

        List<Integer> cift = result.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();

        System.out.println(cift);

    }
}
