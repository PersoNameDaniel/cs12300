// Course.java
public class Course {
    private String courseNumber;
    private String courseTitle;

    public void setCourseNumber(String number) {
        courseNumber = number;
    }

    public void setCourseTitle(String title) {
        courseTitle = title;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void printInfo() {
        System.out.println("Course Information:");
        System.out.println("   Course Number: " + courseNumber);
        System.out.println("   Course Title: " + courseTitle);
    }
}

// OfferedCourse.java
public class OfferedCourse extends Course {
    private String instructorName;
    private String location;
    private String classTime;

    public void setInstructorName(String name) {
        instructorName = name;
    }

    public void setLocation(String loc) {
        location = loc;
    }

    public void setClassTime(String time) {
        classTime = time;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getLocation() {
        return location;
    }

    public String getClassTime() {
        return classTime;
    }

    public void printInfo() {
        super.printInfo();
        //System.out.println("   Instructor Name: " + instructorName);
        //System.out.println("   Location: " + location);
        //System.out.println("   Class Time: " + classTime);
    }
}
