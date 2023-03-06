
import java.util.Scanner;

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
    private String gender;
    private String address;
    private Laptop tool;
    
    public Student(){
        id = 1;
        name = "tester";
        gender = "F";
        address = "1 abc";
        tool = new Laptop();
    }  
    Student(int id, String name, String gender, String address, Laptop tool){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.tool = tool;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public Laptop getTool() {
        return tool;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTool(Laptop tool) {
        this.tool = tool;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id:");
        id = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Enter gender:");
        gender = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("Enter address:");
        address = sc.nextLine();
        tool.input();
    }
    public void output(){
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("gender" + gender);
        System.out.println("address" + address);
        tool.output();
        
    }
}
