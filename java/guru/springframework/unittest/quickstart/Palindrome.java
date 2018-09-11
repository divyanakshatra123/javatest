package guru.springframework.unittest.quickstart;

import java.util.Scanner;

public class Palindrome {


    public String bro(String b)
    {
        int r,temp,sum=0;
        int k = Integer.parseInt(b);
        int  h=0;

        temp=k;
        while(k>0)
        {
            r=k%10;
            sum= sum*10+r;
            k=k/10;

        }
        if(temp==sum){
            System.out.println("its a palindrome");
            return new String("its a palindrome");
        }
        else {
            System.out.println("its not a palindrome");
            return  new String("its not a palindrome");

        }


    }
    public int arr(int d)
    {
        int temp = d;
        int h=0;
        int r;
        while(temp>0)
        {
            r = temp%10;
            if(r%2==0)
            {
                h=h+r;
            }
            temp =temp/10;

        }
        return h;
    }
}
