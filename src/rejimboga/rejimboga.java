package rejimboga;

import java.util.*;


public class rejimboga {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть число:");
        int a = sc.nextInt();

        if(999 < a && 10000000 > a){
            int b = (a/100000);
            int c = ((a%100000)/10000);
            int d = (((a%100000)%10000)/1000);
            int e = ((((a%100000)%10000)%1000)/100);
            int f = (((((a%100000)%10000)%1000)%100)/10);
            int g = (((((a%100000)%10000)%1000)%100)%10);

            if (b == g && c == f && d == e){
                System.out.println("Данне число є паліндромом");
            }else if(99 < a && 10000 > a){
                System.out.println("Данне число є паліндромом");
            } else
                System.out.println("Данне число не є паліндромом");
        }
    }
}
