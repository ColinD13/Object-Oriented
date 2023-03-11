public class CollegeCourse {
    private String classId;
    private int hours;

    @Override
    public String toString() {
        return "CollegeCourse{" +
                "classId='" + classId + '\'' +
                ", hours=" + hours +
                ", grade=" + grade +
                '}';
    }

    private char grade;

    public CollegeCourse(String classId,int hours,char grade)
    {
        this.classId = classId;
        this.hours = hours;
        this.grade = grade;
    }

    public String getClassId() {
        return classId;
    }

    public void setId(String classId) {
        this.classId = classId;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
