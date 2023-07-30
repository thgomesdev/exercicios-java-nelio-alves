package entities;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double grade;
    public double missing;


    public double calculateGrade(){
        this.grade = n1 + n2 + n3;
        this.calculateMissing();
        return grade;
    }

    public void calculateMissing(){
        if (grade >= 60){
            this.missing = 0;
        }else {
            this.missing = 60 - grade;
        }
    }
}
