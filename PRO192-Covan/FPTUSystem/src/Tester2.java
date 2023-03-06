
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Tester2 {
       public static void main(String[] args) {
           
           CourseList list = new CourseList();
           //list.loadData("data.txt");
           list.loadData(CourseList.filename);
           list.displayCourses();
           System.out.println("Enter course's name to update:");
           Scanner sc = new Scanner(System.in);
           String name = sc.nextLine();
           list.updateCourse(name);
           System.out.println("mo file ma xem");
    }
}
