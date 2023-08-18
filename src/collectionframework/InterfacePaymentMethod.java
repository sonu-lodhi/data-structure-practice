package collectionframework;

interface PaymentMethod{
    void pay();
}

class DebitCard implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Paying via a Debit Card");
    }
}

class CreditCard implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Paying via a Credit Card");
    }
}

class UPI implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Paying via a UPI");
    }
}
public class InterfacePaymentMethod {

    public static void makePayment(PaymentMethod pm){
        pm.pay();
    }
    public static void main(String[] args) {
        PaymentMethod pm = new CreditCard();
        makePayment(pm);
    }


}
