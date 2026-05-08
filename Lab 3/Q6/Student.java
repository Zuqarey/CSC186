public class Student {

    private String name;
    private int noMatrix;
    private int part;
    private String course;
    private Subject[] subject;

    public Student(String name, int noMatrix, int part, String course, Subject[] subject) {
        this.name = name;
        this.noMatrix = noMatrix;
        this.part = part;
        this.course = course;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNoMatrix(int noMatrix) {
        this.noMatrix = noMatrix;
    }

    public void setPart(int part) {
        this.part = part;
    }

    public void setCourse(String course) { 
        this.course = course;
    }

    public void setSubject(Subject[] subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public int getNoMatrix() {
        return noMatrix;
    }

    public int getPart() {
        return part;
    }

    public String getCourse() {
        return course;
    }

 
    public double calcGPA() {
        int totCreditHour = 0;
        double totQtPt = 0;
        double point = 0;

        for (int a = 0; a < subject.length; a++) { 
            totCreditHour += subject[a].getCreditHour();

            String grade = subject[a].getGrade();

            if (grade.equalsIgnoreCase("A+") || grade.equalsIgnoreCase("A"))
                point = 4.00;
            else if (grade.equalsIgnoreCase("A-"))
                point = 3.67;
            else if (grade.equalsIgnoreCase("B+"))
                point = 3.33;
            else if (grade.equalsIgnoreCase("B"))
                point = 3.00;
            else if (grade.equalsIgnoreCase("B-"))
                point = 2.67;
            else if (grade.equalsIgnoreCase("C+"))
                point = 2.33;
            else if (grade.equalsIgnoreCase("C"))
                point = 2.00;
            else if (grade.equalsIgnoreCase("C-"))
                point = 1.67;
            else if (grade.equalsIgnoreCase("D+"))
                point = 1.33;
            else if (grade.equalsIgnoreCase("D"))
                point = 1.00;
            else
                point = 0.00;

            totQtPt += subject[a].getCreditHour() * point;
        }

        return totQtPt / totCreditHour;
    }

    public String toString() {
        String result = "";

        for (int a = 0; a < subject.length; a++) {
            result += subject[a].toString() + "\n";
        }

        return "Name : " + name +
               "\nMatrix Number : " + noMatrix +
               "\nPart : " + part +
               "\nCourse : " + course +
               "\nSubjects : \n" + result +
               "\nGPA : " + calcGPA();
    }
}