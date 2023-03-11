public class InputGrades {
    public static void main(String[] args) {


        char grade1 = 'A';
        int hours1 = 1;
        String cId1 = "c1";
        char grade2 = 'B';
        int hours2 = 2;
        String cId2 = "c2";
        char grade3 = 'C';
        int hours3 = 3;
        String cId3 = "c3";
        char grade4 = 'D';
        int hours4 = 4;
        String cId4 = "c4";
        char grade5 = 'F';
        int hours5 = 5;
        String cId5 = "c5";
        String sId1 = "abc123";
        String sId2 = "def456";
        CollegeCourse[] classes = new CollegeCourse[5];
        CollegeCourse[] classes2 = new CollegeCourse[5];

        CollegeCourse c1 = new CollegeCourse(cId1, hours1, grade1);
        CollegeCourse c2 = new CollegeCourse(cId2, hours2, grade2);
        CollegeCourse c3 = new CollegeCourse(cId3, hours3, grade3);
        CollegeCourse c4 = new CollegeCourse(cId4, hours4, grade4);
        CollegeCourse c5 = new CollegeCourse(cId5, hours5, grade5);


        Student s1 = new Student(sId1, classes);
        s1.setCourses(c1,0);
        s1.setCourses(c2,1);
        s1.setCourses(c3,2);
        s1.setCourses(c4,3);
        s1.setCourses(c5,4);

        Student s2 = new Student(sId2,classes2);
        s2.setCourses(c5,0);
        s2.setCourses(c4,1);
        s2.setCourses(c3,2);
        s2.setCourses(c2,3);
        s2.setCourses(c1,4);

        System.out.println(s1.toString() + " " + s1.getCourses(0).toString());
        System.out.println(s2.toString() + " " + s2.getCourses(0).toString());
    }
}
