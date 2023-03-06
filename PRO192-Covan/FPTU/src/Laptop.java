
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Laptop {
    private int id;
    private String name;
    private String MAC;
    
    public Laptop(){
        id = 1;
        name = null;
        MAC = null;
    }

    public Laptop(int id, String name, String MAC) {
        this.id = id;
        this.name = name;
        this.MAC = MAC;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMAC() {
        return MAC;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id:");
        id=sc.nextInt();
        sc=new Scanner(System.in);
        System.out.println("enter name:");
        name=sc.nextLine();
        sc=new Scanner(System.in);
        System.out.println("enter MAC:");
        MAC=sc.nextLine();
    }
    public void output(){
        System.out.println("id:"+ id);
        System.out.println("name:"+ name);
        System.out.println("MAC:"+ MAC);
    }
}
