package com.lambton;

public class FirstDay
{
    public static  void main(String[] args)
    {
        System.out.println("Gagan");
        // Variable Declaration
        int a, b, c;


        a = 10;
        b = 20;
        c = a + b ;


        System.out.println("SUM : " + c);
        int x = Integer.MAX_VALUE;
        System.out.println("X : " + x);

        int y = x + 1;
        System.out.println("Y : " + y);
        System.out.println("Min : " + Integer.MAX_VALUE);

        Student s1 = new Student();
        s1.setvalues();
        s1.display();


    }

}
