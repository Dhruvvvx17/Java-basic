// To understand the concepts of objects and classes

class account{
    int acc_no;
    String name;
    float amount;

    void insert(int no, String Name, float amt){
        acc_no = no;
        name = Name;
        amount = amt;
    }

    void deposite(int amt){
        amount = amount+amt;
        System.out.println(amt + " Deposited in " + name + "'s account");
    }

    void withdraw(int amt){
        if(amount > amt){
            amount = amount - amt;
            System.out.println(amt + " Withdrawn from " + name + "'s account");            
        }
        else
            System.out.println("Insufficient amount");
    }

    void check_balance(){
        System.out.println("Current balance = " + amount);
    }
}

public class test_account {
    public static void main (String args[]){
        account a1 = new account();
        a1.insert(100005, "Dhruv", 38500);
        a1.check_balance();
        a1.withdraw(100);
        a1.check_balance();
        a1.deposite(38600);
        a1.check_balance();
    }
}