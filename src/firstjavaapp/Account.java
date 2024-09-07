package firstjavaapp;

import java.util.Scanner;

public class Account {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Accounts[] ac = new Accounts[100];
        
        int nump, i;
        System.out.print("Enter no. of Accounts: ");
        nump = sc.nextInt();
        
        for(i = 0; i < nump; i++) {
            System.out.println("Enter Details of Account " + (i + 1) + ": ");
            
            int id;
            boolean sameID;
            do {
                sameID = false;    
                System.out.print("Id: ");
                id = sc.nextInt();
                int x;
                for(x = 0; x < i; x++) {
                    if(ac[x].pid == id) {
                        System.out.println("ID already exists!");
                        sameID = true;
                        break;
                    }
                }
            } while(sameID);
            
            String fn, ln, eml, un, pw;
            boolean sameUsername, sameEmail;
            
            System.out.print("Firstname: ");
            fn = sc.next();
            
            System.out.print("Lastname: ");
            ln = sc.next();
            
            do {
                sameEmail = false;
                System.out.print("Email: ");
                eml = sc.next();
                int x;
                for(x = 0; x < i; x++) {
                    if(ac[x].email.equals(eml)) {
                        System.out.println("Email already exists!");
                        sameEmail = true;
                        break;
                    }
                }
            } while(sameEmail);
            
            do {
                sameUsername = false;
                System.out.print("Username: ");
                un = sc.next();
                int x;
                for(x = 0; x < i; x++) {
                    if(ac[x].username.equals(un)) {
                        System.out.println("Username already exists!");
                        sameUsername = true;
                        break;
                    }
                }
            } while(sameUsername);
        do {
                System.out.print("Password: ");
                pw = sc.next();
        }while (!Accounts.isPasswordValid(pw));
            
            ac[i] = new Accounts();
            ac[i].addAccounts(id, fn, ln, eml, un, pw);
        }
        
        for(i = 0; i < nump; i++) {
        ac[i].viewAccounts();   

        }

    } 
    
}
