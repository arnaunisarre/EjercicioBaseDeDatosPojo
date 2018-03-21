public class Main {

    public static void main(String[] args) {

        Session s = Factory.openSession();

        Employee e4 = (Employee)s.save(Employee.class, "Lucas", 1, 900);
        Employee e5 = (Employee)s.save(Employee.class, "María", 2, 900);

        Employee e1 = (Employee)s.get(Employee.class, 7);
        Employee e2 = (Employee)s.get(Employee.class, 7);

        Employee e3 = (Employee)s.delete(Employee.class, 2);

        Employee e6 = (Employee)s.update(Employee.class, "María", 2);

        Department d = (Department)s.get(Department.class, 99);

    }
}
