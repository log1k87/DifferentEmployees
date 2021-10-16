public class Employee2 {

    long id;
    String name;
    int age;
    double salary;
    String gender;


    Employee2(){}

    Employee2(long id,String gender,String name, int age,double salary){

        this.id=id;
        this.gender=gender;
        this.name=name;
        this.age=age;
        this.salary=salary;

    }


    public double salary() {return salary;}

    public String toString() {
        return
                "\n\nid: "+id+
                        "\nName: "+name+
                        "\nAge: "+ age+
                        "\nGender: "+gender+
                        "\nSalary: "+salary;

    }

}
