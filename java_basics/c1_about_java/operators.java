package java_basics.c1_about_java;

public class operators {
    public static void main(String[] args) {
        int x = 10;
        x++; // 11
        ++x; // 12
        x--; // 11
        --x; // 10
        System.out.println(x); // 10
        boolean b = true;
        b = !b;
        x = ~x;
        System.out.println(b);
        System.out.println(x);

        int y = 20;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x * y);
        System.out.println(x % y);

        System.out.println(x << 2); // x*2^2 //left shift
        System.out.println(x >> 3); // x/2^3 //right shift

        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(false | false);

        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x == y);
        System.out.println(x != y);

    }
}
