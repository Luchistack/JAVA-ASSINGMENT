import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class MeanTest{


@Test
 void testCalculateMean(){

      Mean checker = new Mean();

      double [] numbers = {2,4,6,8};

      double actualResult = checker.calculateMean(numbers);  

      double expectedResult = 5.0;

        
       assertEquals(expectedResult, actualResult); 
              
  }   
  
@Test
void testCalculateVariance(){


      Mean checker = new Mean();

      double [] numbers = {2,4,6,8};
    
      double actualResult = checker.CalculateVariance(numbers);

      double expectedResult = 5.0;

      assertEquals(expectedResult, actualResult, 0.001);
}

@Test
void testTheResultOfStandardDeviation(){

      Mean checker = new Mean();

      double [] numbers = {2,4,6,8};
    
      double actualResult = checker.TheResultOfStandardDeviation(numbers);

      double expectedResult = 2.236;

      assertEquals(expectedResult, actualResult, 0.001);


}


}
