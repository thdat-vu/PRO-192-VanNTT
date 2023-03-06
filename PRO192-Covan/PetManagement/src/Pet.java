/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petmanage;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author baodu
 */
public class Pet {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        private int id;
        private String name;
        private String bd;
        
        public void inputPet (){
            // chạy từng dòng trong try, nếu có lỗi lập tức dừng, chuyển xuống catch
            boolean cont = false;
            cont = false;
            do {
                try {
                    scanner = new Scanner(System.in);
                    System.out.println("Id: ");
                    id=scanner.nextInt(); 
                    cont = false;
                    if (id<0) throw new Exception();
                } catch (Exception e){
                    System.out.println("Id is invalid");
                    cont = true;
                }
            } while (cont);
            cont = false;
            do {
                try {
                    scanner = new Scanner(System.in);
                    System.out.println("Name ");
                    name=scanner.nextLine(); 
                    cont = false;
                    if (name.isEmpty()) throw new Exception();
                } catch (Exception e){
                    System.out.println("name is invalid");
                    cont = true;
                }
            } while (cont);
            cont= false;
            do {
                try {
                    scanner = new Scanner(System.in);
                    System.out.println("Bday: ");
                    bd=scanner.nextLine(); 
                    if (!bd.matches("^[0-9][0-9][/][0-9][0-9][/][0-9]{4}$"))
                        throw new Exception();
                    cont = false;
                } catch (Exception e){
                    System.out.println("bd is invalid");
                    cont = true;
                }
            } while (cont);
// khi có lỗi jaba lập một Object trong heap (lưu địa chỉ dòng code bị lỗi, tên như trong ()
// do đó ta tạo một biến con trỏ để sau này ta có thể lấy method trong đó
// nhưng chưa tối ưu: chỉ handle đc lỗi nhập sai datatype

// catch (Exception e) bắt MỌI loại lỗi runtime
//        
//                
        }
        public void outputPet (){
            System.out.println("Id: "+id+", name: "+name+", BD: " +bd);
        }
        public PetManage(String ten){
            id=0;
            name=ten;
            Date d=new Date();
            bd=d.toString();
        }
        // setter
        public void setName (String name){
            if (name!=null && !name.isEmpty()){
                this.name=name;
            }
        }
        public void setId(int newId){
            if (newId>0){
                id=newId;
            }
        }
        public void setBd(String newBd){
            if (newBd!=null && !newBd.isEmpty()){
                bd=newBd;
            }
        }
        // getter
        public String getName(){
            return name;
        }
        //
        
        public int getId(){
            return id;
        }
        public String getBd (){
            // return theo format y-m-d;
            String[] tam=bd.split("[/-]"); // sau khi cắt tam
            return tam[2]+"-"+tam[1]+"-"+tam[0];
        }
}