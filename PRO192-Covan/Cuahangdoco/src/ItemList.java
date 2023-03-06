/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class ItemList {
    private Item []list;
    private int noItem;
    private final int MAX =100;
    
    public ItemList(){
        list = new Item[MAX];
        noItem = 0;
        
    }
    //them 1 item vao list
    public boolean addItem(Item it){
        if(noItem >= MAX) return false;// list is full
        list[noItem] = it;
        noItem++;
        return true;
    }
    //xuat cac item trong list
    public void displayList(){
        for(int i = 0; i < noItem; i++){
        System.out.println(list[i]);
        }
    }
    public void displayItemByCreator(String findCreator){
        for(int i = 0; i < noItem; i++){
            if(list[i].getCreator().equals(findCreator)){
                System.out.println(list[i]);
            }
        }
    }
    //tim kiem dua vao value, dua ra index tim thay
    public int findIndexByValue(int value){
        for (int i = 0; i < noItem; i++) {
            if(list[i].getValue() == value) return i;
            
        }
        return -1;
    }
    //tim kiem dua vao value, dua ra value tim thay
    public Item findItemByValue(int value){
        for (int i = 0; i < noItem; i++) {
            if(list[i].getValue() == value) return list[i];
        }
        return null;
    }
    
}
