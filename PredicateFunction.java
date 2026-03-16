import java.util.Arrays;

public class PredicateFunction{

public static boolean [] numberOfArrays(int [] numbers){

    boolean [] totalArray = new boolean[numbers.length];

    for(int count = 0; count < numbers.length; count ++){

        if(numbers[count] % 2 == 0){

            totalArray[count] = true;
        } else {
            totalArray[count] = false;
            
        }

    }

    return totalArray;
}



public static int [] doubleNumbers(int [] numbers){

int [] totalArray = new int[numbers.length * 2];

for(int count = 0; count < numbers.length; count ++){
       
            totalArray[count] = numbers[count];

            totalArray[count + numbers.length] = numbers[count] * 2;
               
    }

            return totalArray;


    }

}
