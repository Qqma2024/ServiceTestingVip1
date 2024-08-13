import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class TestGetToken {
    @Test
    public void TestToken(){
        RestAssured.baseURI="http://localhost:8080/";
        RestAssured.given()
                      .queryParam("userName",WeworkConfig.getInstance().userName)
                      .queryParam("password",WeworkConfig.getInstance().password)
                   .when()
                       .post("/pinter/bank/api/login2")
                   .then()
                       .log().all()
                       .statusCode(200)
                        .body("message",equalTo("success"));
    }
}
