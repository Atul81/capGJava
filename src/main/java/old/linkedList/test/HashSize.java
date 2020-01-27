package old.linkedList.test;

import java.io.IOException;
import java.util.Hashtable;

public class HashSize {

 

  

    public static void main(String[] args) throws IOException {
        
        Hashtable<String,String> hash=new Hashtable<String,String>();
        
        hash.put("a","a");
//        System.out.println(hash.);
        hash.put("a","b");
        System.out.println(hash.size());
       System.out.println(hash.get("a"));
    }
}
