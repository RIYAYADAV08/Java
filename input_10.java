import java.util.*;

public class input_10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a);
        String name = sc.nextLine(); // agar mujhe pura naam print karna hai jaise complete Tony Stark
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        byte b = sc.nextByte();
        System.out.println(b);

        float price = sc.nextFloat();
        System.out.println(price);

        double d = sc.nextDouble();
        System.out.println(d);

        boolean x = sc.nextBoolean();
        System.out.println(x);

        short s = sc.nextShort();
        System.out.println(s);

        long l = sc.nextLong();
        System.out.println(l);
    }
}