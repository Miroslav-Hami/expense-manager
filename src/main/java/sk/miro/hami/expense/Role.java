package sk.miro.hami.expense;

public class Role {
    public enum authority { ADMIN, USER }
    private long id;
    private authority name;

    Role() {
        System.out.println("Role() : Default constructor");
    }

    Role(long id, authority name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public authority getAuthority() {
        return name;
    }

    public String toString() {
        return "RoleID: " + getId() + ", Authority: " + getAuthority();
    }
}