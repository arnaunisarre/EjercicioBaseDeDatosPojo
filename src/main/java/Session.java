import java.lang.reflect.Field;
import java.sql.PreparedStatement;

public class Session {

    public  Session(){

    }
    public Object save(Class c, String name, int id, int salary) {

        StringBuffer buf = new StringBuffer();

        buf.append("INSERT INTO ");
        buf.append(c.getSimpleName());
        buf.append("(");

        for (Field f:c.getDeclaredFields()){
            buf.append(f.getName());
            buf.append(",");
        }
        buf.setLength(buf.length()-1);
        buf.append(") VALUES (");
        for (Field t:c.getDeclaredFields()){
            buf.append("?,");
        }
        buf.setLength(buf.length()-1);
        buf.append(")");


        String query1 = buf.toString();

        System.out.println(query1);

        return null;

    }

    public  Object update(Class c, String name, int id, int x){

        StringBuffer buf = new StringBuffer();

        buf.append("UPDATE ");
        buf.append(c.getSimpleName());
        buf.append(" SET ");

        for (Field f:c.getDeclaredFields()){
            buf.append(f.getName());
            buf.append("=?,");
        }
        buf.setLength(buf.length()-1);
        buf.append(" WHERE id = ?");



        String query = buf.toString();

        System.out.println(query);

        return null;

    }

    public  Object get(Class c, int id){
       String query =" SELECT * FROM "+c.getSimpleName()+" WHERE id = ?";
       System.out.println(query);
       return null;
    }

    public Object delete (Class c, int id) {
        String query2 = "DELETE * FROM " +c.getSimpleName()+ " WHERE id =?";


       // PreparedStatement pstmt = con.prepareStatement();

        //pstmt.setInt(2, 110592)
        System.out.println(query2);

        return null;
    }




}
