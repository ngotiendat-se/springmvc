package dummy;

import java.io.Serializable;

/**
 * Created by datnt on 10/1/2016.
 */
public class Customer {

    private String userName;
    private String fullName;
    private String password;
    private String email;

    private Customer(Builder builder) {
        userName = builder.username;
        fullName= builder.fullname;
        password = builder.password;
        email = builder.email;
    }

    public static class Builder {

        // required parameter
        private String username;
        private String password;

        public Builder(String _username, String _password) {
            username = _username;
            password = _password;
        }

        // optional parameter
        private String fullname;
        private String email;

        public Builder fullname(String _fullname) {
            this.fullname = _fullname;
            return this;
        }

        public Builder email(String _email) {
            this.email = _email;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
