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
        Course c1 = new Course("anh van", 5);
        Course c2 = new Course("anh em", 1);
        Course c3 = new Course(" taylor", 2);
        
        Student stu = new Student();
        stu.enrolledCourse(c1);
        stu.enrolledCourse(c2);
        stu.enrolledCourse(c3);
        
        System.out.println("in4:");
        stu.output(); 
        System.out.println("After findding");
        
        String courename = "anh van";
        Course kq = stu.findCourse(courename);
        if(kq!=null)    System.out.println(kq);
        else System.out.println("Not found!");
        
        courename = "java";
        kq = stu.findCourse(courename);
        if(kq!=null)    System.out.println(kq);
        else System.out.println("Not found!");
    }
}
