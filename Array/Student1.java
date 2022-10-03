public class Student1 {
    public int roll_no;
    public String name;
    Student1(int roll_no, String name){
       this.roll_no = roll_no;
       this.name = name;
    }

    public static void main(String args[]){
        Student1[] stu = new Student1[5];

        stu[0] = new Student1(101, "Nathayoo");
        stu[1] = new Student1(102, "Nathan");
        stu[2] = new Student1(103, "Nathiya");
        stu[3] = new Student1(104, "Subashchandran");
        stu[4] = new Student1(105, "Subam");

        for(int i =0; i < stu.length; i++){
            System.out.println("Elements of Students "+i+ " : "+stu[i].roll_no+" "+stu[i].name);
        }
    }
}
