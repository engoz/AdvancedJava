package variableTypes;

public class TestObj {

    private long id;
    private String name;
    private boolean active;

    public TestObj(long id, String name, boolean active) {
        this.id = id;
        this.name = name;
        this.active = active;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "TestObj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", active=" + active +
                '}';
    }
}
