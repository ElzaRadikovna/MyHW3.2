public class BmiService {
    public double calculate(double weight_kg, double height_m) {

        double result;
        result = weight_kg / (height_m * height_m);

        return (int) result;

    }
}
