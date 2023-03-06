
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class StudentList extends ArrayList<Student>{
    //ham nay de ghi Studentlist vao file binary
    public void writeBinaryFile(String filename){
        FileOutputStream fr = null;
        ObjectOutputStream of = null;
        try{
            fr = new FileOutputStream(filename);//tro vao file tren o dia, co ten trong do
            //neu ko co thi tao 1 file trong co ten do'
            //neu co ten thi la tao buffer de ghi de
            of=new ObjectOutputStream(fr);//tao pointer lien ket vs cai fr tren
            of.writeObject(this);//chu this nay la gi
            //chu this nay la mang 4 dua sinh vien
            //nhung ma dong nay can dc mo
        }catch(Exception e){
            System.out.println("ERROR");
        }finally{
            try{
                if(of!=null) of.close();
                if(fr!=null) fr.close();
            }catch(Exception e){
                System.out.println("ERROR");
            }
        }
    }
    //ham nay  de doc file nhi phan da ghi o ham tren
    //tra ve StudentList
    public ArrayList<Student> readBinaryFile(String filename){
        ArrayList<Student> kq =null;
        FileInputStream of =null;
        ObjectInputStream fr=null;
        try{
            fr =new FileInputStream(filename);
            of =new ObjectInputStream(fr);
            kq=(ArrayList<Student>) of.readObject();
            
        }catch(Exception e){
            System.out.println("Error");
        }
        return kq;
    }
    
    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.add(new Student("SE666",6));
        list.add(new Student("SE172404",10));
        list.add(new Student("SE123",5));
        list.add(new Student("SE687",4));
        list.writeBinaryFile("data.fg");
        
        ArrayList<Student> kq = list.readBinaryFile("data.fg");
        System.out.println("After reading");
        for(Student s: kq) System.out.println("Student" +s.getId() + "-" + s.getMark());
    }
}
