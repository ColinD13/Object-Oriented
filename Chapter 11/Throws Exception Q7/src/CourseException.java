public class CourseException extends Exception{
    private String department;
    private int courseNum;
    private double credits;

    private String message;

    public CourseException(String department,int courseNum,double credits,String message)
    {
        this.department = department;
        this.courseNum = courseNum;
        this.credits = credits;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
