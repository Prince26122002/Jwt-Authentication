package com.example.myFirstProject1.models1;

public class JwtResponse {

    private String jwtToken;
    private String username;

    public static JwtResponseBuilder builder() {
        return new JwtResponseBuilder();
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Inner static Builder class
    public static class JwtResponseBuilder {
        private String jwtToken;
        private String username;

        public JwtResponseBuilder jwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }

        public JwtResponseBuilder username(String username) {
            this.username = username;
            return this;
        }

        public JwtResponse build() {
            JwtResponse jwtResponse = new JwtResponse();
            jwtResponse.setJwtToken(this.jwtToken);
            jwtResponse.setUsername(this.username);
            return jwtResponse;
        }
    }
}
