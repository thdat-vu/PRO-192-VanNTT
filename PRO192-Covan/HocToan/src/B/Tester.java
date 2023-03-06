/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B;
import A.Fraction;

/**
 *
 * @author LENOVO
 */
public class Tester {
    public static void main(String[] args) {
        Fraction A = new Fraction(1, 2);
        Fraction B = new Fraction(3, 4);
        Fraction C = A.add(B.getNum(), B.getDeno());
        System.out.println("after add: " + C.getNum() + "/" + C.getDeno());
    }
}

