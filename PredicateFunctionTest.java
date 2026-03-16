import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PredicateFunctionTest{

    @Test

    public void TestIfPredictiveNumbersPrintsBooleanResult(){

    int [] numbers =  {2, 5, 7, 1, 6, 9};    
    
    PredicateFunction checker = new PredicateFunction();

    boolean [] actualResult = checker.numberOfArrays(numbers);

    boolean [] expectedResult = {true, false, false, false, true, false}; 

    assertArrayEquals(expectedResult, actualResult);

    
    }


    @Test

    public void TestIfEachNumberInAnMultiplys(){

    int [] numbers = {2, 3, 4, 5, 6};    
    
    PredicateFunction checker = new PredicateFunction();

    int [] actualResult = checker.doubleNumbers(numbers);

    int [] expectedResult = {2, 3, 4, 5, 6, 4, 6, 8, 10, 12}; 

    assertArrayEquals(expectedResult, actualResult);

    
    }


}
