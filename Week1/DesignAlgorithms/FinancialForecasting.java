package Week1.DesignAlgorithms;
public class FinancialForecasting {

    public static void main(String[] args) {

        double initialValue = 10000;
        double growthRate = 10;
        int years = 3;

        double futureValue =
                predictFutureValue(
                        initialValue,
                        growthRate,
                        years
                );

        System.out.println(
                "Future Value after "
                        + years
                        + " years = "
                        + futureValue
        );
    }

    public static double predictFutureValue(
            double currentValue,
            double growthRate,
            int years) {

        // Base Case
        if (years == 0) {

            return currentValue;
        }

        // Recursive Case
        return predictFutureValue(
                currentValue * (1 + growthRate / 100),
                growthRate,
                years - 1
        );
    }
}