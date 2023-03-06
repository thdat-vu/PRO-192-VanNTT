

/**
 *
 * @author LENOVO
 */
public class Tester {
    public static void main(String[] args) {
        Pet a = new Pet();
        a.inputPet();
        Pet b = new Pet();  
        b.inputPet();
        //a, b là biến con trỏ
        //int c;  //biến căn bản
        a.outputPet();
        b.outputPet();
        Pet c = new Pet(45, "Chiquaqua", "18/01/2001");
        c.outputPet();
        c.setName("Hải");
        //c.name = " "; //code tồi
        
        System.out.println("After set name:" + c.getName());
        
        Pet d = new Pet(c);
        d.outputPet();
    }
}
