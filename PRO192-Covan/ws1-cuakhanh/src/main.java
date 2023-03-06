
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String[] args) {
        String[] list = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("Hoc Sinh Thu " + i + ": ");
            list[i] = sc.nextLine();
            list[i]=list[i].substring(0, 1).toUpperCase() + list[i].substring(1);
        }
        for (int i = 1; i <= 10; i++) {
            System.out.print("Hoc Sinh Thu " + i + ": " + list[i] + "\n");
        }
    }
}
