package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FancyNumber {

    public static void main(String ...a) throws IOException {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        char[] chars = inp.toCharArray();
        Map<Integer, Integer> map = new HashMap<>();
        for(Character i: chars){
            if(map.containsKey(Character.getNumericValue(i))){
                Integer x = map.get(Character.getNumericValue(i));
                map.put(Character.getNumericValue(i), x+1);
            } else {
                map.put(Character.getNumericValue(i), 1);
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer s = Integer.parseInt(br.readLine());
        String[] ip = br.readLine().split("\\s");
        final boolean[] x = new boolean[1];
        map.entrySet().forEach(i -> {
            if(x[0] == true)
                return;
            else if(i.getValue() >= 4){
                System.out.print("Fancy Number");
                x[0] = true;
            }
        });
        if(x[0] == true){
            return;
        } else if (x[0] == false) {
            for (int i = 0; i < chars.length - 2; i++){
                int n = Character.getNumericValue(chars[i]);
                if((n == Character.getNumericValue(chars[i+1])) &&  n == Character.getNumericValue(chars[i+2])){
                    System.out.println("Fancy Number");
                    x[0] =  true;
                    break;
                } else if((n == Character.getNumericValue(chars[i+1]) - 1) &&  n == Character.getNumericValue(chars[i+2]) - 2){
                    System.out.println("Fancy Number");
                    x[0] = true;
                    break;
                }
            }
        }

        System.out.print("Hi");
    }
}
