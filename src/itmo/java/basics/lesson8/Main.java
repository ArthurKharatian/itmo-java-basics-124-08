package itmo.java.basics.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    static Logger logger = Logger.getLogger("Main");

    public static void main(String[] args) {

        someMethod(5, 2);

//        throwMyUncheckedException();

//        getLineAndHandleException();

//        try {
//            throwMyUncheckedException();
//        } catch (MyUncheckedException e) {
//            System.err.println(e.getMessage());
//        }
//
//        System.out.println(12345);
//
//        try {
//            logger.log(Level.INFO, "It's ok!");
//            throwMyCheckedException();
//        } catch (MyCheckedException | MyUncheckedException e) {
//            logger.log(Level.SEVERE, "It's ok!");
//
//            System.err.println(e.getMessage());
//        } catch (Exception e) {
//
//        } finally {
//            System.out.println("finally");
//        }
    }

    public static void throwMyCheckedException() throws MyCheckedException, MyUncheckedException {
        throw new MyCheckedException("some checked exception");
    }

    public static void throwMyUncheckedException() throws MyUncheckedException {
        throw new MyUncheckedException("some unchecked exception");
    }


    public static String getLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return  reader.readLine();
    }

    public static void getLineAndHandleException() {
        try {
            System.out.println(getLine());
            throwMyCheckedException();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void someMethod(int a, int b) {
        System.out.println(a + b);
    }
}
