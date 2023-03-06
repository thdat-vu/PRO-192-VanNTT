
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Student {
    private int id;
    private String name;
    private HashMap<String, Course> enrolled;
    public Student(){
        id = 1;
        name ="tester";
        enrolled = new HashMap<>();
        
    }
    //ham nay de them 1 mon hoc vao dds enrolled cua sv;;
    public void enrolledCourse(Course c){
        enrolled.put(c.getName(), c);
    }
    //ham nay de xuat thong tin sinh vien 
    public void output(){
        System.out.println("id:" + id);
        System.out.println("name" + name);
        //cach 2
        for(String name: enrolled.keySet()){    //dong nay la sao ???
            System.out.println(enrolled.get(name));
        }
    }
    //ham nay de tim khoa hoc da enroll
    public Course findCourse(String coursname){
        return enrolled.get(coursname);
    }
    
    
}
