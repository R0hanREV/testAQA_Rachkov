import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class ApiTest {
    @Test
    @DisplayName("Проверка GET запроса")
    public void getRequest() {
        given()
                .when()
                .contentType(ContentType.JSON)
                .get("https://postman-echo.com/get?foo1=bar1&foo2=bar2")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .and()
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    @DisplayName("Проверка POST Raw Text запроса")
    public void postRawText(){
        given()
                .contentType(ContentType.JSON)
                .body("test: value")
                .when()
                .post("https://postman-echo.com/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("test: value"));
    }

    @Test
    @DisplayName("Проверка POST-запроса Form Data")
    public void testingPOSTRequest2() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .and()
                .body("form.foo2", equalTo("bar2"));
    }
    @Test
    @DisplayName("Проверка PUT запроса")
    public void putRequest(){
        given()
                .contentType(ContentType.JSON)
                .body("This is expected to be sent back as part of response body")
                .when()
                .put("https://postman-echo.com/put")
                .then()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body"));
    }

    @Test
    @DisplayName("Проверка PATCH запроса")
    public void patchRequest(){
        given()
                .contentType(ContentType.JSON)
                .body("This is expected to be sent back as part of response body.")
                .when()
                .patch("https://postman-echo.com/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    @DisplayName("Проверка DELETE запроса")
    public void deleteRequest(){
        given()
                .contentType(ContentType.JSON)
                .body("This is expected to be sent back as part of response body.")
                .when()
                .delete("https://postman-echo.com/delete")
                .then()
                .statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."));
    }
}
