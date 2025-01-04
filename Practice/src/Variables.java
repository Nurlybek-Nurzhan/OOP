public class Variables {
    public static void main(String[] args) throws Exception {

        // Primitive data types

        byte byteX = 100;

        short shortX = 10000;

        int intX = 1000000;

        long longX = 1000000000L;

        float floatX = 3.14f;

        double doubleX = 3.1415926535897932384626433832795;

        char charX = 'X';

        boolean booleanX = true;

        System.out.println("BYTE of x: " + byteX + "\n"
                + "SHORT of x: " + shortX + "\n"
                + "INT of x: " + intX + "\n"
                + "LONG of x: " + longX + "\n"
                + "FLOAT of x: " + floatX + "\n"
                + "DOUBLE of x: " + doubleX + "\n"
                + "CHAR of x: " + charX + "\n"
                + "BOOLEAN of x: " + booleanX);

        // Reference data types

        String stringX = "Java";

        System.out.println("STRING of x: " + stringX + "\n");

        int x, y, z = 100;

        x = y = z = 1000;

        System.out.println(x  + " " + y + " " + z);
    }
}
