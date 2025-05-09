package starter.acceptancetests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

//@ExtendWith(SerenityJUnit5Extension.class)
class WhenAddingNumbers {

    @Steps
    MathWizSteps michael;

    @Test
    public void addingSums() {
       int a = 1;
       int b =2;

       int sum = a + b;
        //Assert.assertEquals(sum, 3);

        Assertions.assertThat(sum).isEqualTo(3);
    }
}
