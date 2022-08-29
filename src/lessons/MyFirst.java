package lessons;

public class MyFirst {
    byte a = 127;
    static short b = 456;
    static int c = b;

    static boolean flag;
    static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        MyFirst.name = name;
    }

    public  static void main (String[] args) {
        setName("Bruno");
        flag = c != 0;

        System.out.println(flag);
        System.out.println(name);
        System.out.println(c);
    }
}
