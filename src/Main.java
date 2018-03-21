public class Main {

    public static void main(String[] args) {


        System.out.println("Hello World!");


        Session s = Factory.openSession();

        Employee e1 = (Employee)s.get(Employee.class, 7);
        Employee e2 = (Employee)s.get(Employee.class, 7);

        Department d = (Department)s.get(Department.class, 99);

    }
}
