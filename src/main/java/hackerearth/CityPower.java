package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class CityPower {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> mp = new HashMap<>();
        long size = Long.parseLong(br.readLine());
        String[] in = br.readLine().split("\\s");
        long[] inp = new long[in.length];
        long count = new Long(0);
        for(int i = 0; i< inp.length; i++){
            inp[i] = Long.parseLong(in[i]);
            count+= inp[i];
        }
        Set<Long> op = new HashSet<>();
        for(int i = 0;i < inp.length; i++){
            Long c = new Long(0);
            for(int j = 0; j < inp.length; j++){
                if(j != i){
                    c += inp[j];
                }
            }
            op.add(c);
        }
        Long[] sum = op.toArray(new Long[op.size()]);
        Arrays.sort(sum);
        System.out.println(sum[0]);

        mp.entrySet().forEach(i -> {
            int x = 5;

        });
    }
}
