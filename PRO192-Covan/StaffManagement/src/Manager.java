
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Manager extends Staff {
    private int bonus;
//    public Manager(){
//        super();   //Super() là gọi constructor CHUẨN CỦA lớp cha. nó phải được gọi trước cái dòng bonus.
//        bonus = 1;
//    }
    public Manager(int id, String name, String gender, int basic, int bonus){
        super(id, name, gender, basic);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public void inputManager(){
        inputStaff();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bonus");
        bonus = sc.nextInt();

    }

    @Override
    public void inputStaff() {
        super.inputStaff(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bonus");
        bonus = sc.nextInt();
    }
    
    public void outputManager(){
        outputStaff();
        System.out.println("Bonus: " + bonus);
    }

    @Override
    public void outputStaff() {
        super.outputStaff();
        System.out.println("Bonus: " + bonus);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
