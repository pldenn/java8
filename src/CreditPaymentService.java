public class CreditPaymentService {
    public double calculate(int amount, double year, double percent){
        double percentRate = percent / 12 / 100;
        double Base =  percentRate + 1;
        double Power = year * 12;
        double result = Math.pow(Base, Power);
        double coefficient = (percentRate * result) / (result - 1);
        double paymentAmount = coefficient * amount;
        return paymentAmount;
    }

}
