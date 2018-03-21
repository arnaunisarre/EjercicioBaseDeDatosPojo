public class Session {

public  Session(){

}
public  void save(Class c) {






   //String query1 = "INSERT INTO"+ c.getSimpleName() +"("+ id + "," + name "," + salary + ")";


}

public  void update(){


    }
    public  Object  get(Class c, int id){
       String query =" SELECT * FROM "+c.getSimpleName()+" WHERE id = ?";
       System.out.println(query);
        return null;
    }
    public  void delete(){


    }




}
