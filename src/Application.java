public class Application {
    public static void main(String[] args) {
        int count = 0, number = 0;
        System.out.println("20 so nguyen to dau tien la: ");
        for (int i = 2; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count == 2 && i == j) {
                    System.out.print("\t" + i);
                    number++;
                    count = 0;
                }
                if (i == j) {
                    count = 0;
                }
                if (number == 20) {
                    return;
                }
            }
        }
    }
}
