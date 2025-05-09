package AssertionTests;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertionChecks {

    @Test
    public void traditionalAssertions(){

        int age = 21;
        List<Integer> ages = Arrays.asList(10,20,21,30);
        assertTrue(ages.contains(age));
        //assertEquals(age, 21);
    }

    @Test
    public void assertJAssertions(){

        int age = 21;
        List<Integer> ages = Arrays.asList(10,20,21,30);
        Assertions.assertThat(age).isGreaterThanOrEqualTo(21);

        //assertThat(ages)
                //.contains(10)
                //.hasSize(4)
                //.allMatch(a -> a >= 0 && a <= 100)
                //;

    }
}
