public class Designer extends Employee2{


    int rate;
    int workedDays;

    Designer(){}

    Designer(long id,String gender,String name, int age,double salary, int rate, int workedDays){

        super(id,gender,name,age,salary);
        this.rate=rate;
        this.workedDays=workedDays;

    }

    @Override
    public double salary() {
        return salary + rate * workedDays;

    }

    @Override
    public String toString() {
        return super.toString()+
                "\nRate: "+rate +
                "\nWorkedDays: "+ workedDays+
                "\n=================\n";

    }


}
