public class BmiService {
    public int getResultBMI(double heightMeters, int weightKg) {
        double resultBMI = weightKg / heightMeters / heightMeters;
        return (int) resultBMI;
    }
}