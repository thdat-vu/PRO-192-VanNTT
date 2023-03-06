/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Plant {
    public class Plant extends BeingLivng{

        public Plant() {
            super();
        }

        public Plant(String name) {
            super(name);
        }
    
        
        @Override
        public void grow(){
            System.out.println("by light");
        }
    }
}
