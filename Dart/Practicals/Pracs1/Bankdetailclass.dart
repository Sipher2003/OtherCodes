class bank{
String name="";
int accno=0;
int balance=0;
  
void withdraw(int witamt){
  if(balance<5000){
    print("You cant withdraw ${witamt} bcoz limit is minimum 5000");
  }
  else{
    balance=balance-witamt;
    print("You have successfully withdrawn ${witamt} and current balance is ${balance}");
    
  }
}
  
void deposit(int depamt){
    balance = balance + depamt;
    print("You have deposited ${depamt} successfully. Current Balance is ${balance}");
}
  
void display(){
  print("Name of customer is ${name}");
  print("Acc no is ${accno}");
  print("Bank bal is ${balance}");
  
}
}

void main() {
  bank b1=bank();
  b1.name="Kaustubh";
  b1.accno=310;
  b1.balance=90000;
  b1.display();
  b1.withdraw(3000);
  b1.display();
  b1.deposit(5000);
  b1.display();
}