
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Tester1 {
    public static void main(String[] args) {
        //Tạo 1 Staff object
        Staff a = new Staff(1, "Thi no", "F", 100);
        a.outputStaff();
        
        //Tạo 1 manager object
        Manager b = new Manager(2, " CHí Phèo", 120, 50);
        b.outputManager();
        
        Staff c;
        System.out.println("1. Create a staff");
        System.out.println("2. Create a manager");
        System.out.println("Display");                                                                                                                                      
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a choice");
        int choice = 0;
        choice = sc.nextInt();
        do{
        switch(choice){
            case 1:
                c = new Staff();
                c.inputStaff();
                break;
            case 2:
                c = new Manager();
                //c.inputStaff(); Chỉ mới nhập đc 4 field của Manager trừ cái bonus
                ((Manager)c).inputManager();    //Ép kiểu
                break;
            case 3:
                if(c!=null){
                    if(c instanceof Manager)    //Để ý cái instanceof
                        ((Manager)c).outputManager();
                    else if(c instanceof Staff) //Để ý cái instanceof
                        c.outputStaff();
//từ dòng này trở về sau là code ngu
//                      if(c instanceof Staff){   //instanceof check qhe is-a
//                          c.outputStaff();
//                          else if(c instanceof Manager){
//                                  ((Manager)c).outputManager();
//                          }    
//                      }code ngu
                //Tips: Check cái cụ thể trước, rồi check cái thuộc tính tổng quát ở trước
                //là check điều kiện theo kiểu trên ấy
                }
                break;
        }
    }while(choice <= 3);
}
