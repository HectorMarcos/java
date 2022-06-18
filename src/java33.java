class card{
    String bank;
    String number;
    String validThru;
    String holder;
    long balance;
    boolean status;

    public card(String bank, String number, String validThru, String holder) {
        this.bank = bank;
        this.number = number;
        this.validThru = validThru;
        this.holder = holder;
        this.balance = 1000;
        this.status = false;
    }

    public void activate(){
        if(status == false){
            status = true;
            System.out.println("Card activated");
        }else {
            System.out.println("Card was already activated");
        }
    }

    public void deActivate(){
        if(status == true){
            status = false;
            System.out.println("Card deactivated");
        }else {
            System.out.println("Card was already deactivated");
        }
    }

    public void pay(int amount){
        if(status == true){
            balance = balance - amount;
            System.out.println("You paid "+amount+" and your new balance is "+balance);
        }else{
            System.out.println("You need to activate your card before make any payment");
        }
    }

    public void checkBalance(){
        System.out.println("Your balance is: "+balance);
    }

}

public class java33 {

    void newCard(){
        card card1 = new card("BBVA","1234123412341234", "20/25","Hector Marcos");
        card1.activate();
        card1.pay(1500);
        card1.checkBalance();
    }

    public static void main(String[] args) {
        java33 java33 = new java33();
        java33.newCard();
    }
}
