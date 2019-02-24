package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListMut {
    public void Display() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("S");
        list.add("J");

        for(String str: list)
            str+= "50";

        System.out.print(list);
    }

    public static void main(String  ...a) throws IOException {

        ListMut inp = new ListMut();
        inp.Display();
    }
}
