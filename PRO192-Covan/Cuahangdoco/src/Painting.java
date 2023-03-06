
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;
    
    public Painting() {
        super();
    }
    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);

        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
     public void outputPainting() {
        super.output();

        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
        System.out.println("Is Watercolour: " + this.isWatercolour);
        System.out.println("Is Framed: " + this.isFramed);
    }
    public void inputPainting() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        
        this.height = sc.nextInt();
        
        System.out.println("Enter width: ");
       this.width = sc.nextInt();
       sc = new Scanner(System.in);

        System.out.println("Enter isWatercolour: ");
       this.isWatercolour = sc.nextBoolean();
        
        System.out.println("Enter isFramed: ");
        this.isFramed = sc.nextBoolean();
    }
}
