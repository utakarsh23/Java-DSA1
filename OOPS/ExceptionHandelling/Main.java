package ExceptionHandelling;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        try {
//            int c = b / a;
//            int c = a / b;
//            divide(a, b);
//            throw new Exception("Just for fun");
            String name = "Shresth";
            if(name.equals("Shresth")) {
                throw new MyException("hehe my new exception");
            }
        } catch (MyException e) {
            System.out.println("my excep");
            System.out.println(e.getMessage());
        }  catch (ArithmeticException e) {
            System.out.println("Divided By Zeros");
            System.out.println(e.getMessage());
        }  catch (Exception e) {
            System.out.println("Divided By Zero huhh");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Will be executed anyway");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(a == 0) throw new ArithmeticException("Don't divide it by zero man");
        return a/b;
    }
}
