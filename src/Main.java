public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 180;
        int mass = 90;
        int index = service.calculate(height, mass);
        System.out.println(index);
    }
}