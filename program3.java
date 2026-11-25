
    class BankAc{
        int balance=1000;
        void deposit(int amount){
            balance=balance+amount;
           
        }
    }
     class SavingAc extends BankAc{
        void addInterest(){
            balance=balance+100;
        }
        void display(){
            BankAc b = new BankAc();
            System.out.println("Saving balance"+balance);
            System.out.println("New balance"+super.balance);
            
        
            
           
        }
    }
    public class program3 {
    public static void main(String[] args) {
        
        SavingAc s = new SavingAc();
        s.deposit(500);
       
        s.addInterest();
        s.display();
        
        
        
        
    }
    
}
