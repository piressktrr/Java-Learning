package pedro.ProjetoJava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest4 {
    public static void main(String[] args) throws SQLException, FileNotFoundException {
        try {

            throw new IndexOutOfBoundsException();

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        }

//        try {
//            throw new FileNotFoundException("a");
//        } catch (FileNotFoundException e) {
//            throwsNewExceptions();
//        }

//        try {
//            throwsNewExceptions();
//        } catch (SQLException e) {
//            System.out.println("SQLException in throws new Exception");
//            e.printStackTrace();
//            throw e;
//        } catch (FileNotFoundException e) {
//            System.out.println("FileNotFoundException");
//        }FileNotFoundException
        // aq em cima é do jeito "mais antigo e verboso"

        try {
            throwsNewExceptions();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("SQLException and FileNotFoundException");
            throw e;


        }


    }

    private static void throwsNewExceptions () throws SQLException, FileNotFoundException {
        System.out.println("inside throwsNewExceptions");
        throw new SQLException();

    }
}
