import java.util.Scanner;

import java.util.scanner;
public Class A{
    public static void main(String[] args){
        int a,b,c;
        System.out.println("Enter any two number:");
        Scanner s= new Scanner(System.in);

        a=s.nextInt();
        b=s.nextInt();

        c=a+b;
        System.out.print("sum of two number:"+c);
    }
}