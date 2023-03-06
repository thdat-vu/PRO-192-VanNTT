
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class CourseList extends ArrayList<Course>{
    //ham nay de doc mon hoc tu 1 file text
    //doc xong luu mon hoc vao course list
    public static final String filename ="data.txt";
    public void loadData(String filename){
        //mofile
        //ham check xem file co ca chon hay ko
        File f = new File(filename); 
        BufferedReader r = null;
        if(f.exists()){
            FileReader fr= null;
            try{
                fr = new FileReader(filename);//lenh new so 1
                r = new BufferedReader(fr); //lenh new so 2
                while(r.ready()){
                    String s = r.readLine();
                    String[] arr = s.split(",");
                    if(arr.length == 2){
                        Course c = new Course(arr[0], Integer.parseInt(arr[1].trim())); //nho cat khoang trang
                        add(c);
                    }
                }
            }catch(IOException e){
                System.out.println("ERROR");
            }finally{
                try{
                    if(fr!=null)    fr.close();
                    if(r!=null) r.close();
                }catch(Exception e){
                    System.out.println("Error!");
                }
            }
        }
    } 
        //doc
        //dong
        public void displayCourses(){
            for (Course thi : this) {
                System.out.println(thi);
            }
        }
        //ham nay de tim kiem mon hoc dua vao name
        //tra ve Course tim thay 
        public Course findCourse(String name){
            for(Course c: this){
                if(c.getName().equals(name)) return c;
            }
            return null;
        }
        //ham nay de sua mon hoc khi co name
        public void updateCourse(String name){
            Course c = findCourse(name);
            if(c!=null){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter new name:");
                String newname = sc.nextLine();
                System.out.println("Enter new credit:");
                int newCredit = sc.nextInt();
                //o day co can add lai ko????
                //cau tra loi la khong
                c.setName(newname); //sua bang ham set
                c.setCredit(newCredit); //sua xong gan vo bang ham set
                //ghi vao file
                writeFile(filename);
            }
            else System.out.println("Not Found");
        }
        //ham nay de ghi ds course vao file text
        public void writeFile(String filename){
            PrintWriter w = null;
            try{
                File f = new File(filename);
                    if(f.exists()){
                        System.out.println("Ban co muon ghi de hay khong(Y/N??");
                        Scanner sc = new Scanner(System.in);
                        String ans = sc.nextLine();
                        if(ans.equalsIgnoreCase("n")) return;
                    }
                    //ghi file 
                    w = new PrintWriter(filename);
                    for(Course c:this){
                        w.println(c.getName()+","+c.getCredit());
                        w.flush();
                    }
            }catch(Exception e){
                System.out.println("Error");
            }finally{
                try{
                    if(w!=null) w.close();
                }catch(Exception e){
                    System.out.println("Error");
                }
            }
        }
    
}
