public class BmiService {
    public int calculate(int height, int mass) {
        int index = mass * 100 / (height * 2);
        return index;
    }
}
