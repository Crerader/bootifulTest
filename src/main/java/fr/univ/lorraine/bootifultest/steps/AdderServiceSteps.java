package fr.univ.lorraine.bootifultest.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import fr.univ.lorraine.bootifultest.service.AdderService;

import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNotEquals;

@ContextConfiguration(classes = AdderService.class)
public class AdderServiceSteps {
    @Autowired
    private AdderService adderService;
    private int givenNumber;
    private int sum;
    private int base;

    public void givenBaseAndAdder(int adder) {
        this.adderService.baseNum();
        base = this.adderService.currentBase();
        this.givenNumber = adder;
    }
    public void whenAdd() {
        sum = this.adderService.add(givenNumber);
    }
    public void summedUp() {
        assertEquals(""+base + givenNumber,base + givenNumber, sum);
    }
    public void sumWrong() {
        assertNotEquals("Not Eaquals : "+base + givenNumber,base + givenNumber, sum);
    }
    public void whenAccumulate() {
        sum = adderService.accumulate(givenNumber);
    }

    public int getGivenNumberr(){
        return this.givenNumber;
    }
}
