/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;


/**
 *
 * @author LENOVO
 */
public class Item {
    protected int value;
    protected String creator;

    public Item() {
        value = 0;
        creator = null;
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void output() {
        System.out.println("Value: " + this.value);
        System.out.println("Creator" + this.creator);
    }
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value: ");
        this.value=sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("Enter creator: ");
        this.creator = sc.nextLine();
    }
}
