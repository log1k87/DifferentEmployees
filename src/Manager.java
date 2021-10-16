public class Manager extends Employee2{

    Manager(){}

    Manager(long id,String gender,String name, int age,double salary){
        super(id,gender, name, age, salary);

    }

    @Override
    public double salary() {return salary;}

    @Override
    public String toString() {
        return super.toString()+"\n=================\n";
    }

}
