//create a class accesible anywhere called GivenMeanNumbers same as the name on the test file
//create a method, with the data type double and the method checker name calculateMean on your test file
//initialise a total double and store 0 in it, meaning not none yet
//iterate throu the numbers by using a for loop to chcek through to get the lenth of numbers in the array
//add the looped  counted numbers together to get the total, by adding into the emthy total data initialised earlier (total += numbers[count])
//return mean by the dividing total sum of numbers by total numbers in the array (4)




public class Mean{


public double calculateMean(double [] numbers){


double total = 0;

for(int count = 0; count < numbers.length; count ++){

    total += numbers[count];

}

  return total/numbers.length;

}

public double CalculateVariance(double [] numbers){



double meanValue = 5;

double varianceSum = 0;

for(int counter = 0; counter < numbers.length; counter ++){

//
//    varianceSum += meanValue -= numbers[counter];


    varianceSum += Math.pow(numbers[counter] - meanValue, 2);
    

}

    return varianceSum / numbers.length;

}
public double TheResultOfStandardDeviation(double [] numbers){

    return Math.sqrt(CalculateVariance(numbers));


}
}

