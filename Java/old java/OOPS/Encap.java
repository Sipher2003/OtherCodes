public class Encap {
    public static void main(String[] args) {
        Bank b=new Bank();
        
        b.deposit(200);
        System.out.println(b.showbal());;
    }

}

class Bank{
private int balance=0; //cant be accessed outside class

void deposit(int n){
balance+=n;
}

public int showbal(){
    return balance;
}
}
