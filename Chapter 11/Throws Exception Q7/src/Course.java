public class Course {
    private String department;
    private int courseNum;
    private double credits;

    public Course() {
        this.department = "Default";
        this.courseNum = 000;
        this.credits =0.0;
    }

    public Course(String department, int courseNum, double credits)
    {
        try {
            if (department.length() < 3) {
                throw new CourseException(department, courseNum, credits, "Department number is less than three letters");
            }
            else if(courseNum<100 || courseNum > 499)
            {
                throw new CourseException(department,courseNum,credits,"Course Num has to be between 100-499");
            }
            else if(credits<.5 || credits>6)
            {
                throw new CourseException(department,courseNum,credits,"Credits has to be over .5 and 6 or less");
            }

            this.department = department;
            this.courseNum = courseNum;
            this.credits = credits;
        }
        catch(CourseException c)
        {
            System.out.println(c.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "department='" + department + '\'' +
                ", courseNum='" + courseNum + '\'' +
                ", credits=" + credits +
                '}';
    }
}
