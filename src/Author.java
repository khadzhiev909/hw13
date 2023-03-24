import java.util.Objects;

public class Author {
    private String lasName;
    private String firstName;

    public Author (String lasName, String firstName) {
        this.lasName = lasName;
        this.firstName = firstName;
    }

    // Создайте геттер для всех полей
    public String getLastName() {
        return this.lasName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    @Override
    public String toString() {
        return "lastName: " + lasName + ", firstName: " + firstName;
    }
    @Override
    public int hashCode() {
        return Objects.hash(lasName, firstName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(lasName, author.lasName) && Objects.equals(firstName, author.firstName);
    }
}


