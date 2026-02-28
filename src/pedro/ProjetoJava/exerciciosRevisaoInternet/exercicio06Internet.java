package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Scanner;

public class exercicio06Internet {

    static void squarePattern(int rows, int columns){

        for (int row = 0; row <= rows; row++){
            System.out.print("*");
        }

        for (int column = 0; column <= columns; column++){
            System.out.println("*");

            for (int row = 0; row <= rows; row++){
                if (row == rows){
                    if (columns == column){
                        break;
                    }
                        System.out.print("*");
                        for (int i = 0; i < rows; i++){
                            System.out.print(" ");
                        }
                }
            }
        }

        for (int row = 0; row <= rows+1; row++){
            System.out.print("*");
        }
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Let's create a Square Star Pattern with rows and columns decided by you!!");
        System.out.println("Enter 2 numbers, one for the length of rows and another for the length of columns: ");
        int rows = entrada.nextInt();
        int columns = entrada.nextInt();
        squarePattern(rows, columns);


    }
}
