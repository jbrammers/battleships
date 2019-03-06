package GUI;

/**
 * @author Oliver Grubb
 * This class defines a standard user with a username and password.
 *
 */
public class StandardUser {

    private String username;
    private String password;

    public StandardUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
