package sk.miro.hami.expense;

public class Role {
    private long id;
    private Authority name;

    Role() {
        System.out.println("Role() : Default constructor");
    }

    Role(long id, Authority name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Authority getAuthority() {
        return name;
    }

    public String toString() {
        return "RoleID: " + getId() + ", Authority: " + getAuthority();
    }
}