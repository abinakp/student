package student_information.demo;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;





@Document(collection = "student")
public class Student {

    @Id
    private String id;
    private String name;
    private Date date;
    private String classz;
    private String division;
    private String gender;
    public Student() {
        super();

    }

    public Student(String id, String name, Date date, String classz, String division, String gender) {
        super();
        this.id = id;
        this.name = name;
        this.date = date;
        this.classz = classz;
        this.division = division;
        this.gender = gender;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate( Date date ) {
        this.date = date;
    }

    public String getClassz() {
        return classz;
    }

    public void setClassz( String classz) {
        this.classz = classz;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision( String division) {
        this.division = division;
    }

    public String getGender() {
        return gender;
    }

    
    public void setGender( String gender) {
        this.gender = gender;
    }







}