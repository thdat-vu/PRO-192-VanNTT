
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class demoCopyPaste {
    //ham nay de doc 1 file nhi phan
    //tra vce array ò byte
    public byte[] copyFile(String filename){
        byte[] rs = null;
        FileInputStream fr=null;
        //con tro rong
        
        try{
            File f = new File(filename);
            if(f.exists()){
                fr = new FileInputStream(filename);
                //dong nay tao 1 con tro moi den file minh muon
                rs = new byte[fr.available()];//dong nay la gi ????
                //dong nay de tao ra 1 buffer dai bang dung luong byte
                fr.read(rs);
                
            }
        }catch(Exception e){
            System.out.println("ERROR!");
        }finally{
            try{
                if(fr!=null) fr.close();
                
            }catch(Exception e){
                System.out.println("ERROR");
            }
        }
       
        return rs;
    }
    //ham nay ghi array of byte vao file binary
    public void patseFile(byte[] data, String filename){
        FileOutputStream fr=null;
        try{
            fr = new FileOutputStream(filename);
            fr.write(data);
        }catch(Exception e){
            System.out.println("ERROR");
        }finally{
            try{
                if(fr!=null)    fr.close();
            }catch(Exception e){
                System.out.println("ERROR");
            }
        }
    }
    public static void main(String[] args) {
        demoCopyPaste obj = new demoCopyPaste();
        byte[] data = obj.copyFile("35.jpg");
        obj.patseFile(data, "35-copy.png");
        System.out.println("Mo ra ma xem");
    }
}
