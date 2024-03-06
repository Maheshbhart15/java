package Constructor;

public class Student {
    //
    //Copy construcor is constructor
    // this is constructor whicy copy the current reference into the object
    //used to create the exactly same object exting object

    int ID;
    String name;
    int num;


    Student() {

    }

    Student(int ID, String name, int num) {
        this.ID = ID;
        this.name=name;
        this.num=num;
    }
    Student(Student s1)
    {
        this.ID=s1.ID;
        this.name= s1.name;
        this.num= s1.num;
    }

    public static void main(String[] args) {
        Student s2=new Student(11,"MAHESH",121);
        Student s3=new Student(s2) ;
    }
}


