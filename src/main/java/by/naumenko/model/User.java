package by.naumenko.model;

public class User {
    private Long id;
    private String name;
    private byte age;
    private int height;

    public User() {
    }

    public User(Long id, String name, byte age, int height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
