package org.it_academy.selenium_study.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.it_academy.selenium_study.framework.rest_api.services.ProductService;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.it_academy.selenium_study.framework.rest_api.endpoints.OnlinerEndpoints.getSushiFilterRollsProductsEndpoint;
import static org.it_academy.selenium_study.framework.rest_api.endpoints.OnlinerEndpoints.getSushiProductsEndpoint;

public class RestAssuredOnlinerTest {

    private static final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void checkRequest() {
        given()
                .when()
                .get(getSushiProductsEndpoint())
                .then()
                .statusCode(200);

        given()
                .when()
                .get(getSushiFilterRollsProductsEndpoint())
                .then()
                .statusCode(200);
    }

    @Test
    public void checkProductsServiceTest() {
        new ProductService()
                .getSushiProductsList()
                .forEach(product -> assertThat(product.getName()).isNotNull());
    }

    @Test
    public void checkNamePrefixTest() {
        new ProductService()
                .getSushiNamePrefixesList()
                .forEach(s -> assertThat(s.getNamePrefix().equals("Роллы")).isTrue());
    }
}
