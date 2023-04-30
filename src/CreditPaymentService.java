public class CreditPaymentService {
    public double calculate(int ammount, int years, double percent) {
        double monthPercent = percent / (100 * 12); // месячная процентная ставка
        double a = 1 + monthPercent; // 1 + месячная ставка
        double months = (double) years * 12; // кол-во мясяцев
        double aExponention = Math.pow(a, months); // степень
        double coefficent = (monthPercent * aExponention) / (aExponention - 1); // коэффициент аннуитета
        double result = ammount * coefficent;
        return result;


    }

}
