//Type conversion is the process of automatically converting one data type into another by the compiler.It is also called implicit and widening.

// Conversion happens when:
// - Type compatible      //yahan int → float conversion possible hai but int -> boolean nhi
// - Destination type > Source type
// Order- byte → short → int → float → long → double

// import java.util.*;

// public class typeconversion_14 {
//     public static void main(String args[]) {
//         // int a = 25;
//         // long b = a; // it is correct because long is bigger than int
//         // long a = 25;
//         // int b = a; // it is wrong because int is smaller than long
//         // System.out.println(a);
//     }
// }

// import java.util.*;

// public class typeconversion_14 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int number = sc.nextFloat(); // ❌ Not allowed: float → int conversion
//         System.out.println(number);
//     }
// }


import java.util.*;

public class typeconversion_14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float number = sc.nextInt();          // ✅ Allowed: int → float
        System.out.println(number);          //Output - 16 ->16.0
    }
}