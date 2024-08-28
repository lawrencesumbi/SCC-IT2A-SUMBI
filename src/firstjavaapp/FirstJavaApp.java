package firstjavaapp;

import java.util.Scanner;

public class FirstJavaApp {

    public static void main(String[] args) {
        //grades grd = new grades();
        //grd.getGrade();
        
        //Product pr = new Product();
        //pr.addProduct(10011, "Soap", 20, 10);
        //pr.viewProduct();
        
        //Product prl = new Product();
        //prl.addProduct(10012, "Cards", 50, 0);
        //prl.viewProduct();
        
        
        Scanner sc = new Scanner(System.in);
        Product[] pr = new Product[100];
        
        int nump, i;
        
        System.out.print("Enter no. of products: ");
        nump = sc.nextInt();
        
        double ttp = 0, totalTEP = 0;
        
        for(i=0; i<nump; i++){
            System.out.println("Enter details of Product "+(i+1)+": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double pri = sc.nextDouble();
            System.out.print("Stocks: ");
            int st = sc.nextInt();
            System.out.print("Sold: ");
            int sold = sc.nextInt();
            
            pr[i] = new Product();
            pr[i].addProduct(id, name, pri, st, sold);
                    
        }
        
        for(i=0; i<nump; i++){
            pr[i].viewProduct();
           
            ttp = ttp + (pr[i].price * pr[i].sold);
            totalTEP = totalTEP + pr[i].price * pr[i].stocks; 
        }
            System.out.println("Total Profit: "+ttp);
            System.out.println("Total TEP: "+totalTEP);
        
    }
    
}
