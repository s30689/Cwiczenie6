import java.util.ArrayList;
import java.util.Date;


    public class Student {
        public static int nextIndexNumber = 1;
        private String indexNumber;
        public String fname;
        public String sname;
        public String email;
        public String address;
        public String phoneNumber;
        public Date birthDate;

        public int itnNumber = 0;
        public int currentSemester;
        public String status;
        public StudyProgramme kierunek;
        public ArrayList <Grade> grades;

        public Student(String fname, String sname, String email, String address, String phoneNumber, Date birthDate) {
            this.fname = fname;
            this.sname = sname;
            this.email = email;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.birthDate = birthDate;
            this.indexNumber = "s" + nextIndexNumber++;
            this.status = "Student";
        }

        public void enrollStudent(StudyProgramme studyprogramme) {
            this.currentSemester = 1;
            this.itnNumber = 0;
            this.status = "Student";
            this.grades = new ArrayList<>();
            this.kierunek = studyprogramme;
            Students.addStudent(this);
        }

        public void addGrade(int grade1, String subjectName){
            Grade grade = new Grade(grade1,subjectName);
            grades.add(grade);
            if(grade1 == 2){
                itnNumber++;
            }
        }

    }