public class BmiService {
    public int calculate(int weight_kg, double height_m) {

        double result;
        result = weight_kg / (height_m * height_m);

        return (int) result;

    }
}
