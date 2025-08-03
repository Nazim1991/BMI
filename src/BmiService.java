public class BmiService {
    public double getResultBMI(double heightMeters, int weightKg) {
        double resultBMI = weightKg / (heightMeters * heightMeters);
        return resultBMI;
    }
}