/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Pet {
    int id ;
    String name;
    public Pet(){
        
    }
    public void input()throws Exception{
//        try{
//            id = myLib.inputNumber(1,1000);
//        }catch(Exception e){
//            System.out.println("sai r ku"); 
//        }
        id = myLib.inputNumber(1, 1000);
        
    }
    public static void main(String[] args) {
        Pet a = new Pet();
        try{
            a.input();
        }
        catch(Exception e){
            System.out.println("loi");
        }
    }
}
