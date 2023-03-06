/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public abstract class BeingLivng {
    private String name;
    public BeingLivng(){
        name = "things";
    }

    public BeingLivng(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //tôi muốn đây là hàm final
    public final void useWater(){
        System.out.println("Uống nước ngọt");
    }
    
    public abstract void grow();
    
}
