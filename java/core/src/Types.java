public class Types {
    public static void main(String[] args) {
        // Numbers
        /// Integer types
        byte numByte = 1; // Type: Byte, Size(bits) = 8, value -128 to 127
        short numShort = 1;// Type: Short, Size(bits) = 16, value -32768 to 32767
        int numInt = 1; // Type: Int, Size(bits) = 32, value -2,147,483,648 to 2,147,483,647
        long numLong = 1; // Type: Long, Size(bits) = 64, value -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        /// Floating-point types
        float numFloat = 1.0F; // Type: Byte, Size(bits) = 32, Значимые биты = 24
        double numDouble = 1.0; // Type: Short, Size(bits) = 64, Значимые биты = 53

        // Booleans
        boolean myTrue = true;
        boolean myFalse = false;

        System.out.println(myTrue || myFalse);
        System.out.println(myTrue && myFalse);
        System.out.println(!myTrue);
        System.out.println();

        // Characters
        char aChar = 'a';
        System.out.println(aChar);
        System.out.println();

        // Strings
        String str = "abcd 123";
        String space = " ";
        String name = "Bob";
        System.out.println(str + space + name);
        System.out.println("My number is " + numInt);

    }
}
