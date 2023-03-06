/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
//Pet co id, name, va danh sach cac dv vma con pet no su dung
public class Pet {
    private int id;
    private String name;
    private ArrayList<Service> listservice;
    public Pet(){
        id = 1;
        name = "Tester";
        listservice = new ArrayList<>();    //<> co cung dc ko co cung ko sao
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Service> getListservice() {
        return listservice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListservice(ArrayList<Service> listservice) {
        this.listservice = listservice;
    }
    
    // ham nay de nhapp thong tin cua 1 con pet
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pet's id:");
        id = sc.nextInt();
        System.out.println("Enter Pet's name:");
        name = sc.nextLine();
        //listService se dc sd de the mdv sau nay
    }
    //ham nay de them 1 dv u cho con pet
    //tra ve true/false
    public boolean addUsedService(Service s){
        return listservice.add(s);
        
    }
    //ham nay de xuat thong tin con Pet
    //gon: id., name, ds dich vu ma no sd
    public void output(){
        System.out.println("pet's id: " + id);
        System.out.println("Pet's name" + name);
        System.out.println("Cac sevice cua Pet: ");
        for(Service tmp:listservice){
//            System.out.println("Service id: " +tmp.getId());
//            System.out.println("Service's name" + tmp.getName());
//            System.out.println("");
              System.out.println(tmp.toString());
        }
    }
}
