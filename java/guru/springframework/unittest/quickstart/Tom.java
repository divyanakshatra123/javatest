package guru.springframework.unittest.quickstart;

import java.util.Scanner;

public class Tom {

    public String T(String f) {
        int n =Integer.parseInt(f);
        if (n >= 20 && n <= 30) {
            if (n % 2 == 0) {
                System.out.println("Jerry");
                return new String("Jerry");
            } else {
                System.out.println("Tom");
                return new String("Tom");
            }
        } else {
            System.out.println("Sorry");
            return new String("Sorry");
        }
    }
}
