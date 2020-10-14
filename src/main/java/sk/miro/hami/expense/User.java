package sk.miro.hami.expense;

public class User {
    private static long i = 1;
    private long id;
    private String username;
    private String password;

    public User() {
        id = i++;
    }

    public User(int id, String username, String password) {
        this.id = i++;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}