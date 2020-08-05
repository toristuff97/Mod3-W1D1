public class UnitConversion {

    public static void Convert(int num) {
        double meters = num * 0.0254;
        System.out.println(num + " inches is equal to " + meters + " meters.");
    }

    public static void main(String[] args) {
        int inches = 322312;
        Convert(inches);
    }
}
