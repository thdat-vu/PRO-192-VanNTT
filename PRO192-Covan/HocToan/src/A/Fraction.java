/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Fraction {
    int num;
    int deno;
    public Fraction(){}
    public Fraction(int num, int deno) {
        this.num = num;
        this.deno = deno;
    }

    public int getNum() {
        return num;
    }

    public int getDeno() {
        return deno;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDeno(int deno) {
        this.deno = deno;
    }
    public Fraction add(int num, int deno) {
        int tmp1= this.num*deno + this.deno*num;
        int tmp2= deno*deno;
        Fraction kq=new Fraction(tmp1, tmp2);
        return kq;
    }
    //public Fraction add(Fraction B) {
       // int tmp1= this.num*B.getDeno() + this.deno*B.getNum();
      // int tmp2= this.deno*B.getDeno();
        
    //}
    public Fraction sub(int num, int deno){
        int tmp1= this.num*deno - this.deno*num;
        int tmp2= deno*deno;
        Fraction kq=new Fraction(tmp1, tmp2);
        return kq;
    }
    public Fraction mul(int num, int deno){
        int tmp1= this.num*num;
        int tmp2= this.deno*deno;
        Fraction kq=new Fraction(tmp1, tmp2);
        return kq;
    }
    public Fraction div (int num, int deno){
        int tmp1= this.num * deno;
        int tmp2= deno*this.deno;
        Fraction kq=new Fraction(tmp1, tmp2);
        return kq;
    }
    private int findGCD(int a,int b){
    int temp;
    while(a!= 0) {
        temp = a % b;
        a = b;
        b = temp;
    }
    return a;
    }
    public void rutgon(Fraction C){
        num = num / findGCD(C.getNum(), C.getDeno());
        deno = deno / findGCD(C.getNum(), C.getDeno());
    }
}
