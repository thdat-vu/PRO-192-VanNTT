/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Service implements Comparable<Service>{    //khuc nay la de compare cho ham sort nay
    private int id;
    private String name;
    private String Serive;

    public Service(int id, String name, String Serive) {
        this.id = id;
        this.name = name;
        this.Serive = Serive;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSerive() {
        return Serive;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerive(String Serive) {
        this.Serive = Serive;
    }
    
    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int compareTo(Service o) {
        if(id > o.getId()) return 1;    //array list thi quan tam cai nay
        else if( id < o.getId()) return -1; //treeset quan trong dong nay
        return 0;
    }
    
    
    
}
