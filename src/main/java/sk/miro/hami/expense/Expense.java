package sk.miro.hami.expense;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Expense {
    private long id;
    private String description;
    private Date created;
    private float amount;
    private User user;
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String toString() {
        return "Expense {" + "id = " + getId() +
                ", User = " + getUser() +
                ", Date = " + format.format(getCreated()) +
                ", Category = " + getCategory() +
                ", description = '" + getDescription() +
                ", amount = " + getAmount() + " }";
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}