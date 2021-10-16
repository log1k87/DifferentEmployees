public class Employee2Factory {

    public  Employee2[] generateEmployees2(int size) {

        Employee2[] tempArray = new Employee2[size];


        String []maleNames= {"Max","Anton","Nick","Mick","Mike","Genadiy","Jack","John"};
        String []femaleNames= {"Anna","Kate","Zoya","Nina","Mariya","Masha","Nino","Anita"};
        String []genderArray = {"male","female"};

        int decider = 0;

        for(int i=0; i<size; i++) {

            decider = 0+(int)(Math.random()*3);

            if(decider == 0) {
                tempArray[i]= new Developer();
                tempArray[i].salary=((Developer)tempArray[i]).salary()*3000+(int)(Math.random()*10000);
                ((Developer)tempArray[i]).fixedBugs=0+(int)(Math.random()*100);
            }

            else if(decider == 1) {
                tempArray[i]= new Manager();
                tempArray[i].salary=((Manager)tempArray[i]).salary()*3000+(int)(Math.random()*10000);

            }

            else if(decider == 2) {
                tempArray[i]= new Designer();
                tempArray[i].salary=((Designer)tempArray[i]).salary()*3000+(int)(Math.random()*10000);
                ((Designer)tempArray[i]).rate=1+(int)(Math.random()*1000);
                ((Designer)tempArray[i]).workedDays=1+(int)(Math.random()*365);

            }

            tempArray[i].id=0+(int)(Math.random()*100);
            tempArray[i].gender=genderArray[0+(int)(Math.random()*2)];


            if(tempArray[i].gender=="male") {
                tempArray[i].name=maleNames[0+(int)(Math.random()*(maleNames.length))];
            }
            else if(tempArray[i].gender=="female") {
                tempArray[i].name=femaleNames[0+(int)(Math.random()*(maleNames.length))];
            }

            tempArray[i].age=20+(int)(Math.random()*50);

        }

        return tempArray;

    }



}
