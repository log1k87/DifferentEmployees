public class EmployeeService2 {

    public Employee2[] array;

    EmployeeService2(Employee2[] array){this.array=array;}


    public void printEmployees() {
        for(Employee2 temp: array) {System.out.println(temp);}
    }



    public double calculateSalaryAndBonus()  {
        double tempSum=0;

        for(Employee2 temp: array) {tempSum+=temp.salary();}

        return tempSum;
    }


    public Employee2 getById(long id)  {
        Employee2 worker=null;

        for(Employee2 temp: array) {
            if(temp.id==id) {worker=temp;}

        }

        return worker;

    }


    public Employee2 getByName(String name) {
        Employee2 worker=null;

        for(Employee2 temp: array) {

            if(temp.name==name) {worker=temp;}}

        return worker;

    }


    public Employee2[] sortByName()  {
        for(int x=0; x<array.length; x++) {
            for(int i=0; i<array.length; i++) {
                if((array[x].name.compareTo(array[i].name))<0)
                {
                    Employee2 temp=array[x];
                    array[x]=array[i];
                    array[i]=temp;


                }
            }
        }
        return array;

    }


    public Employee2[] sortByNameAndSalary()  {

        for(int x=0; x<array.length; x++) {
            for(int i=0; i<array.length; i++) {

                if(array[x].name.compareTo(array[i].name)<0) {
                    Employee2 temp=array[x];
                    array[x]=array[i];
                    array[i]=temp;
                    if(array[x].name.compareTo(array[i].name)==0)
                    {if(array[x].salary<array[i].salary){
                        double res=array[x].salary;
                        array[x].salary=array[i].salary;
                        array[i].salary=res;
                    }
                    } }
            }

        }
        return array;
    }


    public Employee2 edit(Employee2 employee)  {
        Employee2 temp=null;

        for(int i=0; i<array.length; i++){
            if(array[i].id==employee.id) {
                temp=array[i];
                array[i]=employee;}
        }

        return temp;

    }



    public Employee2 remove(long id) {

        Employee2 temp=null;
        int count=0;
        int count2=0;
        Employee2 [] tempArray=new Employee2[array.length-1];

        for(int i=0; i<array.length; i++){
            if(array[i].id==id) {
                temp=array[i];
                array[i]=null;
            }
        }

        for(int i=0; i<array.length; i++) {
            if(array[i]==null)
            {continue;}
            tempArray[count++]=array[i];

        }


        array = new Employee2[count];

        for(int i=0; i<tempArray.length; i++) {
            array[count2++]=tempArray[i];
        }


        return temp;

    }

    public void add(Employee2 e) {

        Employee2[] temp= new Employee2[array.length+1];

        for(int i=0; i<array.length;i++) {
            temp[i]=array[i];
        }

        array = new Employee2[array.length+1];

        for(int i=0; i<array.length;i++) {
            array[i]=temp[i];
        }

        array[array.length-1]=e;

    }




}
