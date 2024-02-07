package basicprogram.java8features;

public class AmazonPay implements UPIPayment{
    @Override
    public String doPayment(String source, String dest) {

        String transactionDate = UPIPayment.datePatterns("yyyy-MM-dd");

        return transactionDate;
    }
}
