import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        //Employee2Factory ef = new Employee2Factory();
        //System.out.println(Arrays.toString(ef.generateEmployees2(12)));


        Employee2 [] array = new Employee2[] {
                new Manager(1,"male", "Max",27,2000),
                new Developer(2,"female", "Kate",29,2500,15),
                new Designer(3,"female", "Nina",31,3000,15, 170)
        };

        EmployeeService2 es = new EmployeeService2(array);

        es.printEmployees();//1
        System.out.println("||||||||||||||||||||||||||||||||||||||||-1");
        System.out.println(es.calculateSalaryAndBonus());//2
        System.out.println("||||||||||||||||||||||||||||||||||||||||-2");
        System.out.println(es.getById(3));//3
        System.out.println("||||||||||||||||||||||||||||||||||||||||-3");
        System.out.println(es.getByName("Max"));//4
        System.out.println("||||||||||||||||||||||||||||||||||||||||-4");
        System.out.println(es.edit(new Designer(3,"female", "ANNA",31,5500,15, 200)));//5
        System.out.println("||||||||||||||||||||||||||||||||||||||||-5");
        es.printEmployees();
        System.out.println("||||||||||||||||||||||||||||||||||||||||-5");
        es.add(new Designer(4,"female", "RITA",35,6500,10, 250));//6
        System.out.println("||||||||||||||||||||||||||||||||||||||||-6");
        es.printEmployees();
        System.out.println("||||||||||||||||||||||||||||||||||||||||-7");
        System.out.println(Arrays.toString(es.sortByName()));//7
        System.out.println("||||||||||||||||||||||||||||||||||||||||-8");// this method works if all names are equal;
        System.out.println(Arrays.toString(es.sortByNameAndSalary()));
        System.out.println("||||||||||||||||||||||||||||||||||||||||-9");
        System.out.println(es.remove(2));//9
        System.out.println("||||||||||||||||||||||||||||||||||||||||-9");
        es.printEmployees();
    }





}
