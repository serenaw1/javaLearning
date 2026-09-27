public class TimeCalculator {
    public static void main(String[] args) {
        int totalMin = 135;
        System.out.printf("%d minutes is equivilant to %d hours and %d minutes.", totalMin, (totalMin / 60), (totalMin % 60));
    }
}