
import static java.util.Objects.equals;
import java.util.Scanner;



/**
 *
 * @author LENOVO
 */
public class Circle {
    double x;
    double y;
    double r;
    
    //getter 
    
    public void inputCircle(){
        boolean cont = false;
        do{
            try{
                Scanner sc = new Scanner(System.in);
            System.out.println("Enter x : ");
            x = sc.nextDouble();
            cont = false;
            }catch(Exception e){
                System.out.println("input valid");
                cont  = true;
            }
        }while(cont);
        cont =false;
        do{
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter y : ");
        sc = new Scanner(System.in);
        y = sc.nextDouble();
        cont = false;
            }catch(Exception e){
                System.out.println("input valid");
                cont = true;
            }
        }while(cont);
        cont = false;
        do{
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter r : ");
        sc = new Scanner(System.in);
        r = sc.nextDouble();
                cont = false;
        if(r <= 0 ) throw new  Exception();
        cont = false;
            }catch(Exception e){
                System.out.println("input valid");
                cont = true;
            }
        }while(cont);
        
       
    }
    public void outputCircle(){
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
    
    public void getDistance(double x2, double y2){
        r = Math.sqrt((x - x2)*(x - x2) + (y - y2) * (y - y2));
        System.out.println("Distance : " + r);
    } 
}



