public class TongHieu {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 2;
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(getString());
//        printString();
        sum(10, 20);
    }
    // ham co kieu tra ve
    public  static String getString(){
            return "Ngan";
    }
    //ham khong co kieu tra ve
    public  static void printString(){
        System.out.println("My name is Ngan");
    }
    //ham tinh tong 2 so nguyen bat ki
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
}
