public class  Customer {
   
   String name;
   private String account_number,account_type;
    double balance,depositAmount,withdrowAmount;

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }
    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

  Customer(String name){
     this.name=name;

    }

    public void checkBalance(String account_number) {
        if(account_number==this.account_number){
            System.out.println("Your balance is " + this.balance);
        }else{
            System.out.println("Invalid account number ");
        }
       
        
    }

    public void deposit( double depositAmount, String account_number){
        if(account_number==this.account_number){
            balance= balance+depositAmount;
            System.out.println("Dear "+this.name+ " You deposited " + depositAmount +" on account "+account_number +" Successfully "+ 
            "Your current balance is "+balance);
            
        }else{
            System.out.println("Invalid account number ");
        }


    }

    public void withdrow(double withdrowAmount,String account_number){

        if(account_number==this.account_number){
            if(this.balance<withdrowAmount){
                System.out.println("Sorry ! your account balance is not enougn to withdrow "+withdrowAmount);
              }else if(withdrowAmount<=0){
                System.out.println("Invalid amount !");
              }else{
                balance=this.balance-withdrowAmount;
                System.out.println("Withdrow successfull! Your new balance is "+ balance);
              }
        }else{
            System.out.println("Invalid account number ");
        }            
    }

    public static void main(String[] args){
    Customer Peter=new Customer("Peter");
    Peter.setAccount_number("005");
    Peter.setAccount_type("Saving account");
    Peter.deposit(5000, "009");
    Peter.withdrow(3000,"008");
    Peter.checkBalance("007");
       
    }

}


