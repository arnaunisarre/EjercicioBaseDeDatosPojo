public class Session {

    public  Session(){

    }
    public Object save(Class c, String name, int id, int salary) {
        String query1 = "INSERT INTO " + c.getSimpleName()+ "("+ id +"," + name + ","+ salary +")VALUES (?, ?, ?)";
        System.out.println(query1);
       //String query1 = "INSERT INTO"+ c.getSimpleName() +"("+ id + "," + name "," + salary + ")";
        return null;

    }

    public  Object update(Class c, String name, int id){
        String query3 = "UPDATE * FROM " +c.getSimpleName()+ "WHERE name = ? AND id = ?";
        return null;
    }

    public  Object get(Class c, int id){
       String query =" SELECT * FROM "+c.getSimpleName()+" WHERE id = ?";
       System.out.println(query);
       return null;
    }

    public Object delete (Class c, int id) {
        String query2 = "DELETE * FROM " +c.getSimpleName()+ " WHERE id =?";
        System.out.println(query2);
        return null;
    }




}
