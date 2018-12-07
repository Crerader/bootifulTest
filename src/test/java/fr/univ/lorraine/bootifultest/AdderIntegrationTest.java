package fr.univ.lorraine.bootifultest;

import fr.univ.lorraine.bootifultest.controller.OpController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import net.serenitybdd.jbehave.SerenityStory;
import org.jbehave.core.annotations.BeforeStory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {
        OpController.class, fr.univ.lorraine.bootifultest.service.AdderService.class})
public class AdderIntegrationTest extends SerenityStory {
    @Autowired
    private fr.univ.lorraine.bootifultest.service.AdderService adderService;

    @BeforeStory
    public void init() {
        RestAssuredMockMvc.standaloneSetup(new OpController(adderService));
    }
}