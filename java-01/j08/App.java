void main() {
    int a = Integer.parseInt(IO.readln("Enter first number: "));
    int b = Integer.parseInt(IO.readln("Enter second number: "));
    int Sum = a + b;
    int Difference = a - b;
    int Product = a * b;
    int Quotient = a / b;
    int modulo = a % b;

    IO.println("Sum: " + (a+b));
    IO.println("Difference: " + (a-b));
    IO.println("Product: " + (a*b));
    IO.println("Quotient: " + (a/b));
    IO.println("Modulo: " + (a%b));
}
