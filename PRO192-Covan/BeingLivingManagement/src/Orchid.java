/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Orchid {
    public class Orchid extends Plant implements PriceTable{
        private int price;
        public Orchid(){
            super();
            price = 1000;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
        
        public void updatePrice(){
            price = price * 2;
        }
    }
}
