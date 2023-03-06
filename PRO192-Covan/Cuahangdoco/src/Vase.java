
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Vase extends Item {
    private int height;
    private String material;

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }
    public Vase(){
        height =0;
        material = null;
        
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public void input() {
        super.input(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        height = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("Enter material");
        material = sc.nextLine();
        
    }

    @Override
    public void output() {
        super.output(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

   

    @Override
    public String toString() {
        return super.toString()+"," + height + "," + material; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
}
