package chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class StringCalculator {

    int add(String text){
        if (text == null || text.isEmpty()){
            return 0;
        }

        if (text.length() == 1){
            int number = Integer.parseInt(text);
            try{
                if (number < 0){
                    throw new RuntimeException();
                }
            } catch (RuntimeException e){
                System.out.println("음수가 아닌 숫자 처리 ");
            }


            return number;
        }

        else{
            String[] strings = text.split(",|:");
            int[] numbers = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();

            int sum = 0;
            for(int i = 0; i < numbers.length; i++){
                int number = numbers[i];

                try{
                    if (number < 0){
                        throw new RuntimeException();
                    }
                } catch (RuntimeException e){
                    System.out.println("음수가 아닌 숫자 처리 ");
                }

                sum += number;

                return sum;
            }
        }



        return 0;
    }
}
