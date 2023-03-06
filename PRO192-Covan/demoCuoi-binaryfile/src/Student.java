
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**danh cho ham Writeobject(this);
 * implements Serializable
 *  -> nghia la bat tinh nang mo doi object thanh day nhi phan
 * 
 */
//Clone hay con goi la marker interface de bat 1 so tinh nang an
public class Student implements Serializable{
    private String id;
    private int mark;

    public Student() {
    }

    public Student(String id, int mark) {
        this.id = id;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public int getMark() {
        return mark;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
}
