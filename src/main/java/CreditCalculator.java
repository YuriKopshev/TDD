public class CreditCalculator {

    public double calculateSumPerMonth(int sum, double rate, int period) {
        double monthRate = (rate / 12) / 100;
        double annuityRate = monthRate*(Math.pow(1+monthRate, period))/((Math.pow(1+monthRate, period))-1);
        return (sum*annuityRate);
    }

    public double calculateFullSumReturn(int sum, double rate, int period) {
        double monthRate = (rate / 12) / 100;
        double annuityRate = monthRate*(Math.pow(1+monthRate, period))/((Math.pow(1+monthRate, period))-1);
        return (sum*annuityRate) * period;
    }

    public double calculateOverPaySum(int sum, double rate, int period) {
        double monthRate = (rate / 12) / 100;
        double annuityRate = monthRate*(Math.pow(1+monthRate, period))/((Math.pow(1+monthRate, period))-1);
        return (sum*annuityRate)*period - sum;
    }
}
