import java.util.Arrays;

public class Student {
    private String idNum;
    private CollegeCourse[] courses = new CollegeCourse[5];

    @Override
    public String toString() {
        return "Student{" +
                "idNum='" + idNum + '\'' +
                "},";
    }

    public Student(String idNum, CollegeCourse[] courses)
    {
        this.idNum = idNum;
        this.courses = courses;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public CollegeCourse getCourses(int num) {
        return courses[num];
    }

    public void setCourses(CollegeCourse c, int num)
    {
        this.courses[num] = c;
    }



}
