
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Tester {
    public static void main(String[] args) {
        int choice = 0;
        BeingLivng obj = null;
        //BeingLivng obj2 = new BeingLivng();//lỖI ko đc new 1 lớp trừu tượng
        //PriceTable tmp = new PriceTable();//lỗi
        //PriceTable tmp = new Orchid(); //ok
        
        PriceTable tmp = new PriceTable() {
        }
        
        do{
            System.out.println("1. Create a being living");
            System.out.println("2. Use water");
            System.out.println("3. call grow");
            System.out.println("4. Update Price");
            System.out.println("5. call EatFly");
            System.out.println("Enter a number:");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("1. create an Orchid");
                    System.out.println("2. create a fly trap");
                    System.out.println("3. create a Komodo");
                    System.out.println("Enter a choice:");
                    int choice2 = 0;
                    sc = new Scanner(System.in);
                    choice2 = sc.nextInt();
                    switch(choice2){
                        case 1:
                            obj = new Orchid(100, "calleya");
                            break;
                        case 2:
                            obj = new FlyTrap();
                            
                            break;
                        case 3:
                            obj = new Komodo();
                            break;
                    }
                    break;
                case 2:
                    if(obj!=null) obj.useWater();
                    break;
                case 3:
                    if(obj!=null) obj.grow();
                    break;
                case 4:
                    if(obj!=null){
                        if(obj instanceof PriceTable){
                            PriceTable pt = (PriceTable) obj;
                            pt.updatePrice();
                        }
                    }
                    break;
                case 5:
                    if(obj!=null){
                        if(obj instanceof Food){
                            Food pt = (Food) obj;
                            pt.eatFly();
                        }
                    }
                    break;
        }
        }while(choice <= 5);
    }
}
