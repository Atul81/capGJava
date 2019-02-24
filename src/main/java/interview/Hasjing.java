package interview;

import java.util.*;

public class Hasjing {

    public static void main(String[] args) {
//        System.out.println("HI");
        Map mp = new HashMap<>();
        int[] arr = new int[5];
        System.out.print(arr);
        //Map<String, String> mp = new HashMap<>();
        mp.put("A", "Atul");
        mp.put("V", "Shujaat");
        mp.put("g", "Ahuaat");
        mp.put("LP", "hujaat");
        mp.forEach((k, v) -> {
            System.out.println(k + "     " + v);
        });

        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        Random rand = new Random(47);
        int i=0;
        while(i<5){
            i++;
            int key = rand.nextInt(20);
            int value = rand.nextInt(50);
            System.out.println("Inserting key: "+key+" Value: "+value);
            Integer imap =hm.put(key,value);
            if( imap == null){
                System.out.println("Inserted");
            }
            else{
                System.out.println("Replaced with "+imap);
            }
        }

        hm.entrySet().forEach((k) -> System.out.println("key: "+k.getKey()+" value:"+k.getValue()
        ));

    }

}
