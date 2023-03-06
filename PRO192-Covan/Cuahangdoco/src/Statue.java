/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {
        super();
    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }
    public void outputStatue() {
        super.output();

        System.out.println("Weight: " + this.weight);
        System.out.println("Colour: " + this.colour);
    }
    public void inputStatue() {
        super.input();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight: ");
        this.weight = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("Enter colour: ");
        this.colour = sc.nextLine();
    }
}
