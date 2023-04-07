import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);

            String hexColor = rgbToHex(red, green, blue);
            System.out.printf("Color #%d: RGB(%d, %d, %d) -> HEX: %s%n", i + 1, red, green, blue, hexColor);
        }
    }


    private static String rgbToHex(int red, int green, int blue) {
        System.out.println("SAAAAAAAAA");
        return String.format("#%02X%02X%02X", red, green, blue);

    }
}