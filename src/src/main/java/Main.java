import java.sql.SQLOutput;

public class Main {

  public static void main(String[] args) {
    int one = 1;
    int two = 2;
    int three = 3;
    int four = 4;
    char sun = '\u2600';

    byte a = 121;
    short b = 31446;
    int c = 1234567890;
    long d = 1234567890123456789L;
    float e = 123456789.123456F;
    double f = 12345678901234567890.1234567890123456;
    char g = 'π';
    boolean state = false;


    System.out.println(one + " " + two + " " + three + " " + four);
    System.out.println(sun);

    System.out.println("byte = " + a);
    System.out.println("short = " + b);
    System.out.println("int = " + c);
    System.out.println("long = " + d);
    System.out.println("float = " + e);
    System.out.println("double = " + f);
    System.out.println("char = " + g);
    System.out.println("boolean = " + state);

  }
}
