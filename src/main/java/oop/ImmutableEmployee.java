package oop;

// The ImmutableEmployee is an immutable class, the final keyword ensures that the class can't be extended and
// this class objects cannot be modified once created.
public final class ImmutableEmployee {
    // The final keyword ensures that these  variables can't be changed once initialized.
    private final String name;
    private final int id;

    public ImmutableEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
