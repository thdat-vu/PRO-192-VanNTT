
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class StockManagement {
    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        ItemList stock = new ItemList();
        do{
            System.out.println("1. Add Vase");
            System.out.println("2. Add Statue");
            System.out.println("3. Add Painting");
            System.out.println("4. Display all items");
            System.out.println("5. Display items by creator");
            System.out.println("6. Find the item by value");
            System.out.println("7. Update the item");
            System.out.println("8. Remove the item");
            System.out.println("9. Sort the item based on value");
            System.out.println("10. Display sum of value in the stock");
            System.out.println("11. Display sum of value ( item's created are 'VN') in the stock");
            System.out.println("12. Get the list of items that have value between min, max");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    Item it = new Vase();
                    it.input();
                    if(stock.addItem(it)) {System.out.println("added");}
                    break;
                case 2:
                    Item it2 = new Statue();
                    it2.input();
                    if(stock.addItem(it2)) {System.out.println("added");}
                    break;
                case 3:
                    Item it3 = new Painting();
                    it3.input();
                    if(stock.addItem(it3)) {System.out.println("added");}
                    break;
                case 4:
                    stock.displayList();
                    break;
                case 5:
                    String findCreator;
                    System.out.println("Enter the creator to find");
                    sc = new Scanner(System.in);
                    findCreator = sc.nextLine();
                    stock.displayItemByCreator(findCreator);
                    break;
                    
                case 6:
                    int value;
                    System.out.println("Enter the value you want to find");
                    sc = new Scanner(System.in);
                    value = sc.nextInt();
                    System.out.println(stock.findIndexByValue(value));
                    break;
                case 7:
                    
                    //switch(choice2){
                        
                    //}
                    break;
            }
                
        }while(choice <=12);
    } 
}
