/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Animal extends BeingLivng {

    public Animal(){
        super();
    }

    public Animal(String name) {
        super(name);
    }
    
    @Override
    public void grow() {
        System.out.println("by food");
    }
    public void run(){
        System.out.println("Run by feet");
    }
    
}
