public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        double percent = 9.99;
        int year = 1;
       double payment1 = service.calculate(amount, year, percent);
        System.out.println((long)payment1);
        double payment2 =service.calculate(amount = 1_000_000, year = 2, percent = 9.99);
        System.out.println((long) payment2);
        double payment3 =service.calculate(amount = 1_000_000, year = 3, percent = 9.99);
        System.out.println((long) payment3);
    }
}
