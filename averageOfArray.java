public class averageOfArray {

    public static void main(String[] args) {
        int[] numbers = {-12, 8, -7, 6, 12, -9, 14};
        System.out.println(posAverage(numbers));
    }

    public static double posAverage(int[] numbers) {


            //Write your code to find average of positive numbers in numbers array
            //return the answer
            int sum = 0;
            int countr = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 0) {
                    countr++;
                } else {
                    sum = sum + numbers[i];
                }
            }

            double avg = (double) (sum) / (numbers.length - countr);

            return avg;
        }
    }