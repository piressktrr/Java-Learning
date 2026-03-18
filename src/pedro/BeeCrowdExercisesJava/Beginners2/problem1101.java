package pedro.BeeCrowdExercisesJava.Beginners2;

import java.util.ArrayList;
import java.util.Scanner;

public class problem1101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        while(true){
            int num = input.nextInt();
            if (num<= 0){
                break;
            }
            list.add(num);

        }

        for(int i=0;i<list.size();i+=2){
            sum = 0;
            if (i+1 == list.size()){
                break;
            }
            int maior = Math.max(list.get(i),list.get(i+1));
            int menor = Math.min(list.get(i),list.get(i+1));
            for (int j = menor; j <= maior; j++) {
                System.out.print(menor + " ");
                sum += menor;
                menor += 1;
            }
            System.out.println(" Sum="+sum);
        }

    }
}
