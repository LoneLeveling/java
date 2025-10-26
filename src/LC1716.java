public class LC1716 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(totalMoney(n));
    }

    public static int totalMoney(int n) {
        int fullWeek = n / 7;
        int sumOfFullWeek = (7 * (fullWeek) * (fullWeek + 7)) / 2;

        int remDays = n % 7;
        int sumOfPartialWeek = (int)((remDays /2.0) * (2 * (fullWeek + 1) + (remDays - 1)));
        int fullDaysSsum = sumOfFullWeek + sumOfPartialWeek;
        return fullDaysSsum;

    }
}
