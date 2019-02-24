package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Quaderlepts {
    public static void main(String  ...a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inp = br.readLine().split("\\s");
        System.out.print(checkSquares(inp));
    }

    static boolean checkSquares(String[] inp){
        Integer[][] in = new Integer[inp.length][2];
        for(int i= 0; i< inp.length; i++) {
            String[] pr = inp[i].split(",");
            in[i][0] = Integer.parseInt(pr[0]);
            in[i][1] = Integer.parseInt(pr[1]);
        }
        for(Integer[] x: in){
            System.out.println(x[0]+ "    "+ x[1]);
        }
        Integer prev = 0;
        for(int x = 0; x< in.length; x++){
            Integer curr0 = Math.abs((in[x][0] - in[x+1][0]) - (in[x][1] - in[x+1][1]));
//            if(curr0 != 0){
//               return false;
//            }else
            if(curr0 != 0){
                if (!(prev == Math.abs(in[x][0] - in[x+1][0])))
                    return false;
            }
            prev = Math.max((in[x][0] - in[x+1][0]), (in[x][1] - in[x+1][1])) ;
        }
        return true;
    }
}
