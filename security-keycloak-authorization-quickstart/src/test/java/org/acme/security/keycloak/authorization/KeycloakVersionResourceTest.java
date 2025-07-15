package org.acme.security.keycloak.authorization;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class KeycloakVersionResourceTest {

    @Test
    public void testAccessUserResource() {
        RestAssured
                .when().get("/api/keycloak/version")
                .then()
                .statusCode(200);
    }
}
