public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98.0;         // в килограммах
        double height = 1.87;         // в метрах

        int bmi = service.calculate(weight, height); // должно получиться 28
        System.out.println("Ваш BMI: " + bmi);
    }
}

