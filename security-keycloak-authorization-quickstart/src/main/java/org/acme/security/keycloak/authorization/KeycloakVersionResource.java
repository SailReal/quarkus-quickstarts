package org.acme.security.keycloak.authorization;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.keycloak.admin.client.Keycloak;

@Path("/api/keycloak/version")
public class KeycloakVersionResource {

    @Inject
    Keycloak keycloak;

    @GET
    public String version() {
        return keycloak.serverInfo().getInfo().getSystemInfo().getVersion();
    }
}
