package S.wrong;

public class User {
    public String name;
    public String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void registerUser() {
        System.out.println("Register user " + name);
    }

    public void deleteUser() {
        System.out.println("Delete user " + name);
    }
}
