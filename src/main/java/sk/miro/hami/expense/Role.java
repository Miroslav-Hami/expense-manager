package sk.miro.hami.expense;

public class Role {
    private long id;
    private String authority;

    Role() {
        System.out.println("Role() : Default constructor");
    }

    Role(long id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String toString() {
        return "RoleID: " + getId() + ", Authority: " + getAuthority();
    }
}