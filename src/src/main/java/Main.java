import java.sql.SQLOutput;

public class Main {

  public static void main(String[] args) {
    int one = 1;
    int two = 2;
    int three = 3;
    int four = 4;
    boolean type = true;
    float floatNumber = 12.456F;
    char letter = 'a';
    char sun = '\u2600';

    byte myByte = 123;
    double myDouble = myByte;
    System.out.println(myDouble);
    System.out.println();

    System.out.println(one + " " + two + " " + three + " " + four);
    System.out.println(sun);
    System.out.println(type);
    System.out.println(floatNumber);
    System.out.println(letter);

  }
}
