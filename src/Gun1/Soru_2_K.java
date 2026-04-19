package Gun1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Soru_2_K {
    public static void main(String[] args){

        // 1 den 20 ye kadar olan sayılar yazdırılır.
        // Sadece çift olanlar gösterilir.

        List<Integer> even_num = new ArrayList<>();

        for (int i = 1; i<= 20; i++){
            if (i % 2 == 0){
                even_num.add(i);
            }
        }

        for (Integer e_num: even_num){
            System.out.println(e_num);
        }
    }
}
