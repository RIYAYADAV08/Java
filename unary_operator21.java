//Unary operators are operators that perform an operation on only one operand.
// Pre-increment
// Pre-increment (++a) increases the value first and then uses it.
// Post-increment
// Post-increment (a++) uses the value first and then increases it.

public class unary_operator21 {
    public static void main(String args[]) {
        int a = 10;
        int b = --a;

        System.out.println(b);
    }
}

// public class unary_operator21 {
// public static void main(String args[]) {
// int a = 10;
// int b = ++a;

// System.out.println(a);
// System.out.println(b);
// }
// }

public static void main(String args[]) {

    int a = 10;
    int b = a++;

    System.out.println(a);
    System.out.println(b);
}