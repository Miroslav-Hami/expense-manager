package sk.miro.hami.expense;

public class Category {
    private long id;
    private String description;
    private String name;

    public Category(long id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category {" +
                "id = " + id +
                ", description = '" + description + '\'' +
                ", name = " + name +
                '}';
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

    public String getName() {
        return name;
    }
}