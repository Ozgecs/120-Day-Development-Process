package Gun1;

import java.util.ArrayList;
import java.util.List;

public class Soru_1_K {
    public static void main(String[] args){

        // Sorunun ilk çözülme şekli
        //  5 Adet integer sayıyı, Arraylist içerisine ekle ve yazdır.

        List<Integer> num = new ArrayList<>();

        // add function
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        for (Integer value: num){
            System.out.println(value);
        }
        System.out.println("-------");
        for (int i = 0; i<num.size(); i++){
            System.out.println(num.get(i));
        }
    }
}
