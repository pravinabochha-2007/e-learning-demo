public class Student {
    int id;
    String name;
    String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void display() {
        System.out.println(name + " - " + email);
    }
}
