package btu.beka;

import java.util.Scanner;

public class C {

    private int a;
    private int b;
    private int c;

    public C(){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter [a] [b] [c] Values(int):");

        this.a = myObj.nextInt();
        this.b = myObj.nextInt();
        this.c = myObj.nextInt();
    }

    public int getLastDigOfA(){
        return this.a % 10;
    }

    public int getFirstDigOfB(){
        int _b = this.b;
        while(_b > 10){
            _b /= 10;
        }
        return _b;
    }

    public int getSumOfC(){
        int sum = 0;
        int _c = this.c;
        int n;
        while(_c > 0){
            n = _c % 10;
            _c /= 10;
            sum += n;
        }
        return sum;
    }

    private int multiplyMethod2AndMethod3(){
        return this.getLastDigOfA() * this.getFirstDigOfB();
    }

    public void printMultiplyMethod2AndMethod3(){
        System.out.println("multiplyMethod2AndMethod3() is " + this.multiplyMethod2AndMethod3());
    }

    public void sumMethod3andMethod5(){
        System.out.println("sumMethod3andMethod5() is " + this.getFirstDigOfB() + this.multiplyMethod2AndMethod3());
    }
}
