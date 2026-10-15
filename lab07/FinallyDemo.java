
public class FinallyDemo {

    static int tryReturn() {
        try {
            System.out.println("in try");
            return 1;
        } finally {
            System.out.println("finally runs");
        }
    }

    static int capturedValue() {
        int x = 10;
        try {
            return x;            
        } finally {
            x = 99;       
            System.out.println("finally set x = " + x);
        }
    }

    @SuppressWarnings("finally")
    static int overridden() {
        try {
            return 1;
        } finally {
            return 2;          
        }
    }

    public static void main(String[] args) {
        int result = tryReturn();
        System.out.println("result = " + result);
        System.out.println("capturedValue() = " + capturedValue());
        System.out.println("overridden() = " + overridden() + "   <- return in finally wins");
    }
}
