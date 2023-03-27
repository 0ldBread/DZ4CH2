public class BmiService {
    public int calculate (double height) {
        int weight = 98;
        double index = (double) (height * height);
        int bmi = (int) (weight / index);
        return bmi;
    }
}
