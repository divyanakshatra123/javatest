package guru.springframework.unittest.quickstart;

import java.util.Scanner;

public class Vowel {
    public String vow(String b) {
        String s;
        String o="";
        s=b;
        int n = s.length();
        for (int i = 0; i < n; i++)
        {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                System.out.print("vowel ");
                o= o+"vowel ";
            } else {
                System.out.print("consonant ");
                o= o+"consonant ";

            }

        }
        return o;

    }
}
