public class Main {

    public static void main(String[] args) {

        Session s = Factory.openSession();

        Employee e4 = (Employee)s.save(Employee.class, "Lucas", 1, 900);
        Employee e5 = (Employee)s.save(Employee.class, "María", 2, 900);

        Employee e1 = (Employee)s.get(Employee.class, 7);
        Employee e2 = (Employee)s.get(Employee.class, 7);

        Employee e3 = (Employee)s.delete(Employee.class, 1);

        Employee e6 = (Employee)s.update(Employee.class, "María", 2 , 1000);

        Department d = (Department)s.save(Department.class, "programacion", 99, 6);
        Department e = (Department)s.update(Department.class, "programacion", 99, 7);

    }
}
