package net.htlgkr.krejo.Lamdas;

import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {

    List<String> list = new ArrayList<>();{
    for (int i = 0; i < 10; i++) {
        list.add("Hallo" + i+1);
    }
    }

    public static void main(String[] args) {
        HalloJavamitForEach m = new HalloJavamitForEach();

        for (String s :
                m.list) {
            System.out.println(s);
        }
        System.out.println();
        m.list.forEach((String s) ->System.out.println(s));
        System.out.println();
        m.list.forEach(System.out::println);




    }
}
