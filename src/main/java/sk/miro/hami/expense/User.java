package sk.miro.hami.expense;

public class User {
    private long id;
    private String username;
    private String password;

    User() {
        System.out.println("User() : Default constructor");
    }

    User(long id, String username, String password) {
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "UserIUD: " + getId() + ", Username: " + getUsername() + ", Password: " + getPassword();
    }
}