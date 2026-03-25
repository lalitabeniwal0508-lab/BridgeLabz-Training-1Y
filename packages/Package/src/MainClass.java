import com.GLA.Package.Level1.Student;
import com.GLA.Package.Level1.Faculty;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student("Megha", 101);
        Faculty f1 = new Faculty("Dr. Sharma", "Computer Science");

        s1.displayStudentDetails();
        f1.displayFacultyDetails();
    }
}