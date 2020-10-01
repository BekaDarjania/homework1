package btu.beka;

import java.util.Scanner;

public class A {

    protected int x;

    public A(){
        System.out.println("Hello");
    }

    public void setXValueFromKeyboard(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter x(int):");
        this.x = myObj.nextInt();
    }

    public void printXPlus12(){
        System.out.println(x+12);
    }

    public void oddOrEven(){
        System.out.println("X is " + (x % 2 == 1 ? "odd" : "even"));
    }
}

class B extends A {
    private int y;

    public void setYValueFromKeyboard(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter y(int):");
        this.y = myObj.nextInt();
    }

    public int getXPlusY(){
        return this.x + this.y;
    }
}
