package h2h;

import java.util.*;

public class Words {

    public static void main(String... s) {

    }

    static int answer(List<String> cod, List<String> word) {
        Map<Character, String> mappings = new HashMap<>();
        int i = 97;
        for (String code : cod) {
            mappings.put((char) i, code);
            i++;
        }
        Integer o =0 ;
        if(o.intValue()  +1 == 6 );
        Set<String> ret = new HashSet<>();
        for (String w : word) {
         //   w.cha
            char[] chars = w.toCharArray();
            String add = "";
            for (int j = 0; j < chars.length; j++) {
                if (mappings.containsKey(chars[j])) {
                    add = add.concat(mappings.get(chars[j]));
                }
                if (j == chars.length - 1)
                    ret.add(mappings.get(chars[j]));
            }
            return ret.size();
        }
        return 0;
    }

    static String find(List<List<String>> matrix, String target){
        ArrayList<Integer> ar = new ArrayList<>();
        for(List<String> t : matrix)
            ar.add(t.size());

        char[] chars = target.toCharArray();
        for(int i =0; i< chars.length;  i++) {

        }
		return target;
    }
}





