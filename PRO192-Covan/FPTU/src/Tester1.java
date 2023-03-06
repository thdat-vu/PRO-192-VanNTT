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
        Student stu1 = new Student();
        stu1.input();
        stu1.output();
        
        Laptop tool = new Laptop(100, "Dell", "123");
        Student stu2 = new Student(24, "kiet", "male", "1234", tool);
        stu2.output();
    }
}
