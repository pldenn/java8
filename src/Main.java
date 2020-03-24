public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount;
        double percent;
        int year;
       double payment1 = service.calculate(amount = 1_000_000, year = 1, percent = 9.99);
        System.out.println((long)payment1);
        double payment2 =service.calculate(amount = 1_000_000, year = 2, percent = 9.99);
        System.out.println((long) payment2);
        double payment3 =service.calculate(amount = 1_000_000, year = 3, percent = 9.99);
        System.out.println((long) payment3);
    }
}
