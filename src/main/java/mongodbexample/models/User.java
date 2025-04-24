package mongodbexample.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    private int id;
    private String name;
    private String city;

    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    public int getId(){
        return id;
    }

    public void setint(int id){
        this.id= id;
    }

    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name= name;
    }

    public String getcity(){
        return city;
    }

    public void setcity(String city){
        this.city= city;
    }







}
