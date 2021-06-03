package com.example.demo.model;

import org.springframework.data.annotation.Transient;
import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;




@Document(collection = "student")
public class Student {

	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";
	
    @Id
    private long id;
    
    private String name;
    private Date date;
    private String classz;
    private String division;
    private String gender;
    private String regno;
    public Student() {
//        super();

    }

    public Student(String name, Date date, String classz, String division, String gender) {
//        super();
        this.name = name;
        this.date = date;
        this.classz = classz;
        this.division = division;
        this.gender = gender;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
    
    @Override
    public String toString() {
        return "Student [id=" + id + ", Name=" + name + ", class=" + classz + ", emailId=" + division + ", gender=" +gender+
            "]";

}

    public String getRegno() {
        return regno;
    }

    
    public void setRegno( String regno) {
        this.regno = regno;
    }
    
    
}
