import java.util.Random;

public class Developer extends Employee2{

    int fixedBugs;

    Developer(){}

    Developer(long id,String gender,String name, int age,double salary, int fixedBugs){
        super(id,gender, name, age, salary);
        this.fixedBugs=fixedBugs;

    }
    @Override
    public double salary() {
        return (salary + fixedBugs * 35) * (new Random().nextBoolean() ? 2 : 0);

    }
    @Override
    public String toString() {

        return super.toString()+"\nFixedBugs: "+fixedBugs+"\n=================\n";

    }



}
