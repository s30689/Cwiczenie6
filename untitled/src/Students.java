import java.util.ArrayList;
import java.util.List;

public class Students {
    public static List<Student> allStudents = new ArrayList<Student>();
    public static void promoteAllStudents() {

        for (int i = 0; i < allStudents.size(); i++) {
            if (allStudents.get(i).itnNumber<allStudents.get(i).kierunek.intAmount && allStudents.get(i).currentSemester<allStudents.get(i).kierunek.semestryAmount) {

                allStudents.get(i).currentSemester++;

            }

            else if(allStudents.get(i).currentSemester==allStudents.get(i).kierunek.semestryAmount){
                allStudents.get(i).status = "Absolwent";
            }

        }
    }
    public static void displayInfoAboutAllStudents () {
        for (int i = 0; i < allStudents.size(); i++) {
            if (allStudents.get(i).currentSemester == allStudents.get(i).kierunek.semestryAmount) {
                System.out.println(allStudents.get(i).status + " "
                        + allStudents.get(i).fname
                        + " " + allStudents.get(i).sname);
            } else {
                System.out.println(allStudents.get(i).status + " "
                        + allStudents.get(i).fname + " "
                        + allStudents.get(i).sname + " semester: "
                        + allStudents.get(i).currentSemester);
            }
        }
    }
    public static void addStudent(Student student) {
        allStudents.add(student);

    }
}