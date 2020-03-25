public class Calculator {
    int a;
    int b;
    int c;

    Calculator (int a, int b, int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }

    int add (int a, int b) {
        return a+b;
    }

    int add (int c) {
        return c + add(a, b);
    }
}
