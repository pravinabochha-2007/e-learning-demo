public class Course {
    int courseId;
    String courseName;

    public Course(int id, String name) {
        courseId = id;
        courseName = name;
    }

    public void enroll() {
        System.out.println("Enrolled in " + courseName);
    }
}
