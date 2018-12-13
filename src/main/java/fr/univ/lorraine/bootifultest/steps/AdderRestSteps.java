package fr.univ.lorraine.bootifultest.steps;

import io.restassured.module.mockmvc.response.MockMvcResponse;
import net.thucydides.core.annotations.Step;

import java.io.UnsupportedEncodingException;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.equalTo;

public class AdderRestSteps {

    private MockMvcResponse mockMvcResponse;
    private int currentNum;

    @Step("get the current number")
    public void givenBase() throws UnsupportedEncodingException {
        currentNum = Integer.valueOf(given()
                .when()
                .get("/current")
                .mvcResult()
                .getResponse()
                .getContentAsString());
    }

    @Step("adding {0}")
    public void whenAdd(int num) {
        mockMvcResponse = given()
                .queryParam("num", num)
                .when()
                .post("/add/current");
        currentNum += num;
    }

    @Step("got the sum")
    public void thenSummedUp() {
        mockMvcResponse
                .then()
                .statusCode(200)
                .body(equalTo(currentNum + ""));
    }
}

