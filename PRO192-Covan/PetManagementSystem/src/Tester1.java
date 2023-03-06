
import java.util.Collections;

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
        Pet p = new Pet();
        p.input();
        Service s1 = new Service(1, "tia long", "100");
        if(p.addUsedService(s1))
               System.out.println("Da them dich vu");
        Service s2 = new Service(20, "tam", "200");
        if(p.addUsedService(s2))
               System.out.println("Da them dich vu");
        ///Service s3 = new  
        
        Pet p2 = new Pet();
        p2.input();
        if(p2.addUsedService(s1)) System.out.println("ds them dv cho p2");
        if(p2.addUsedService(s2)) System.out.println("ds them dv cho p2");
        p2.output();
        //da p1 p2 vao PEtlist
        PetList a = new PetList();
        if(a)
            
        //ham nay de sap xep tang dan theo id cua service
        public void sortUsedServiceById(){
           Collections.sort(listservice);
        }
    }   
    
    
    
}
