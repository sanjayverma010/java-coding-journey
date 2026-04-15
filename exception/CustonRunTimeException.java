public class CustonRunTimeException extends RuntimeException {
    CustonRunTimeException(String msg) {
        super(msg);
    }

    CustonRunTimeException() {
        super("age is not valid");
    }

}

class test {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18) {
                throw new CustonRunTimeException("this is my custmise exception");
            } else {
                System.out.println("you are valid person");
            }
        } catch (CustonRunTimeException e) {
            e.printStackTrace();
        }

        System.out.println("im their");

    }
}
