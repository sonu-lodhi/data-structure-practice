package basicprogram.java8features;

public class Payment implements UPIPayment{
    @Override
    public String doPayment(String source, String dest) {
        String transactionDate = UPIPayment.datePatterns("yyyy-MM-dd");
        return transactionDate;
    }

    @Override
    public double getScratchCard() {
        return UPIPayment.super.getScratchCard();
    }
}
