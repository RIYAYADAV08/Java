// Data type tells us what kind of value a variable can store.
// Java data types are divided into two categories:
// 1. Primitive Data Types – byte, short, int, long, float, double, char, boolean
// 2. Non-Primitive (Reference) Data Types – String, Array, Class, Interface, Object, etc.
//

// Data Type	   Size	                    Range
// byte	          1 byte	               -128 to 127
// short	      2 bytes	           -32,768 to 32,767
// int	          4 bytes	               -2³¹ to 2³¹ - 1
// long	          8 bytes	               -2⁶³ to 2⁶³ - 1
// float	      4 bytes	            ~±3.4 × 10³⁸
// double	      8 bytes	            ~±1.7 × 10³⁰⁸
// char	          2 bytes                	0 to 65,535
// boolean	      1 bytes             	    true / false

//We need different data types because different types and sizes of data require different amounts of memory. Using the appropriate data type helps us store data correctly and use memory efficiently.

public class datatypes_7 {
    public static void main(String[] args) {

        // 1. byte
        byte age = 21;

        // 2. short
        short salary = 30000;

        // 3. int
        int population = 1000000;

        // 4. long
        long distance = 9000000000L;

        // 5. float
        float height = 5.6f;

        // 6. double
        double price = 99999.99;

        // 7. char
        char grade = 'A';

        // 8. boolean
        boolean passed = true;

        System.out.println(age);
        System.out.println(salary);
        System.out.println(population);
        System.out.println(distance);
        System.out.println(height);
        System.out.println(price);
        System.out.println(grade);
        System.out.println(passed);
    }
}

// char mein kya-kya aa sakta hai?
// - ✅ Capital letters: A-Z
// - ✅ Small letters: a-z
// - ✅ Digits: 0-9
// - ✅ Special characters: @, #, $, %, etc.
// - ✅ Whitespace characters: space, tab, newline
// - ✅ Unicode characters: जैसे ₹, ©, etc.
// Important: char mein sirf 1 character hota hai aur single quotes ' ' use hote
// hain.