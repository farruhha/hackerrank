package codechallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 9/27/17.
 */
public class DictionariesAndMap {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
            // Write code here
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            if (map.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + map.get(s));
            }
        }
        in.close();
    }
}
