package fr.univ.lorraine.bootifultest;

import fr.univ.lorraine.bootifultest.steps.AdderServiceSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.junit.spring.integration.SpringIntegrationMethodRule;
import net.serenitybdd.junit.spring.integration.SpringIntegrationSerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SerenityRunner.class)
@ContextConfiguration(locations = "classpath:adder-beans.xml")
public class AdderSpringSerenityRunnerIntegrationTest {

    @Rule
    public SpringIntegrationMethodRule springMethodIntegration
            = new SpringIntegrationMethodRule();

    @Steps
    private AdderServiceSteps adderSteps;

    @Value("#{props['adder']}") private int adder;

    @Test
    public void givenNumber_whenAdd_thenSummedUp() {
        adderSteps.givenBaseAndAdder(adder);
        adderSteps.whenAdd();
        adderSteps.summedUp();
    }
}

