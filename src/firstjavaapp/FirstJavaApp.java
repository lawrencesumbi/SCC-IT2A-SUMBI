package firstjavaapp;

import java.util.Scanner;

public class FirstJavaApp {

    public static void main(String[] args) {
        //grades grd = new grades();
        //grd.getGrade();
        
        Product pr = new Product();
        pr.addProduct(10011, "Soap", 20, 10);
        pr.viewProduct();
        
        Product prl = new Product();
        prl.addProduct(10012, "Cards", 50, 0);
        prl.viewProduct();
        
        
    }
    
}
