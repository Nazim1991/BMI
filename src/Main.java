public class Main {
    public static void main(String[] args) {
        BmiService calculate = new BmiService();
        int myBMI = (int) calculate.getResultBMI(1.87, 98);
        System.out.println(myBMI);
    }
}