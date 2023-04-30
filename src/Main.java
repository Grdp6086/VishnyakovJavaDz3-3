public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int ammoutCredit = 1_000_000; // сумма кредита
        int term = 1; // срок кредита в годах
        double creditRate = 9.99; // процентная ставка

        double monthlyPay = service.calculate(ammoutCredit, term, creditRate);
        int printMounthlyPay = (int) monthlyPay;

        System.out.println("Ваш ежемесячный платеж составит " + printMounthlyPay);


    }
}