package Array;

public class Student {
    private String _name;
    private double _grade;

    public Student(String name,double grade){
        this._grade = grade;
        this._name = name;
    }

    public String Name(){
        return this._name;
    }

    public double Grade(){
        return this._grade;
    }

    public void println(){
        System.out.printf("%s\t%f\n",this.Name(),this.Grade());
    }
}