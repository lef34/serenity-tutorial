package Calculations;

import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;

public class ResultChecks {
//Not needed
    //private final String a;
    //private final String b;
    //private final String total;

    //public ResultChecks(String a, String b, String total) {
       //this.a = a;
        //this.b = b;
        //this.total = total;
//Not needed

 //Uncomment to use scenario without csv file
    //public static Stream<Arguments> testData(){
        //return Stream.of(
                //Arguments.of("1", "2","3"),
                //Arguments.of("10", "20", "30"),
                //Arguments.of("2", "0", "2"),
                //Arguments.of("30000", "50000", "80000")

        //);
    //}
    //Uncomment to use scenario without csv file


    @CsvFileSource(resources = "/Calculations.csv", numLinesToSkip = 1)
    @ParameterizedTest(name = "{0} + {1} should equal {2}")
    //Uncomment to use scenario without csv file
    //@MethodSource("testData")
    public void totalCalculation(String a, String b, String total){
        int expectedTotal = Integer.parseInt(a) + Integer.parseInt(b);
        int actualTotal = Integer.parseInt(total);
        Assertions.assertEquals(expectedTotal, actualTotal);

    }
}
