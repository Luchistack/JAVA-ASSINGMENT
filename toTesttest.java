import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertons.*;


class calculatorTest{

    @Test
    void numberPlusNumber(){
    var calculate = new calculator();
    assertEquals(10,calculate.add(5, 5));


}



}
