package java_basics.c1_about_java;

public class dataTypes {
    public static void main(String[] args) {
        //primitive data types
        int i = 20;
        char c = 'c';
        boolean b = true;
        long l = 20000l;        //ends with l
        float f = 2.5f;         //ends with f
        double d = 200.3457d;   //ends with d
        short s = 20;
        byte B = 10;
        
        //just define.
        int x1;
        int i1,i2;

        //int to long conversion
        long x = i;             //method 1
        short y = (short) i;    //method 2

        //Non-primitive data types
        String str = new String("Hello");   //Method 1
        String str2 = "hello!";                      //Method 2
    }
}
