public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight_kg = 98;
        double height_m = 1.87;


        double bodyMassIndex = service.calculate(weight_kg, height_m);


        System.out.println("Индекс массы тела =" + bodyMassIndex);
    }
}
