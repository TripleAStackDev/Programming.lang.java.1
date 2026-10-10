public class App {
    public static void main(String[] args) {
        // Read the temperature in Fahrenheit as a decimal
        double fahrenheit = Double.parseDouble(IO.readln("Enter temperature in Fahrenheit: "));

        // Apply the conversion formula
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Print the result exactly as expected
        System.out.println(fahrenheit + " °F = " + celsius + " °C");
    }
}
