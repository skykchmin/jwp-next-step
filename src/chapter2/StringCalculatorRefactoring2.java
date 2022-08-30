package chapter2;

public class StringCalculatorRefactoring2 {
    public int add(String text){
        if(text == null || text.isEmpty()){
            return 0;
        }

        String[] values = text.split(",");
        return sum(toInts(values));
    }

    public int[] toInts(String[] values){
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++){
            numbers[i] = Integer.parseInt(values[i]);
        }

        return numbers;
    }

    private int sum(int[] numbers) {
        int sum = 0;
        for (int number: numbers){
            sum += number;
        }

        return sum;
    }
}
