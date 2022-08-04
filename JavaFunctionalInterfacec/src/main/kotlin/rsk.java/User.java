package rsk.java;

import org.jetbrains.annotations.NotNull;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void create(@NotNull Created created) {
        created.onCreate(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}