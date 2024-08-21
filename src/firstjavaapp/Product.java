package firstjavaapp;

public class Product {
    
    String pname;
    int pid, stocks;
    double price;
    
    public void addProduct(int id, String name, double prc, int stk){
        this.pid = id;
        this.pname = name;
        this.price = prc;
        this.stocks = stk;

    }
    
    public void viewProduct(){
        

        String status = (this.stocks < 1) ? "Out-of-Stock" : "Available";
        double tep = this.price * this.stocks;
        
        System.out.printf("%-10d %-10s % -10.2f %-10d %-10s %-10.2f\n",
                this.pid, this.pname, this.price, this.stocks, status, tep);
    }
}
