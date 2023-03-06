
import java.util.Scanner;
public class Staff {
    private int id;
    private String name;
    private String gender;
    private int basic;

    public Staff(int id, String name, String gender, int basic) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.basic = basic;
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

    public int getBasic() {
        return basic;
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

    public void setBasic(int basic) {
        this.basic = basic;
    }
    public void inputStaff(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id:");
        id=sc.nextInt();
        sc=new Scanner(System.in);
        System.out.println("enter name:");
        name=sc.nextLine();
        sc=new Scanner(System.in);
        System.out.println("enter gender:");
        gender=sc.nextLine();
         System.out.println("enter basic:");
        basic=sc.nextInt();
    }
    public void outputStaff(){
        System.out.println(id+","+name+","+gender+","+ basic);
    }
}