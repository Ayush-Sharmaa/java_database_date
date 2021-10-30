package Assignment2;

import java.util.Date;

public class Employee {

    public Integer id;
    public String name;
    public Double salary;
    public String Created_by;
    public Date Created_on;
    public String Updated_by;
    public Date Updated_on;

    public String getUpdated_by() {
        return Updated_by;
    }

    public void setUpdated_by(String updated_by) {
        Updated_by = updated_by;
    }

    public Date getUpdated_on() {
        return Updated_on;
    }

    public void setUpdated_on(Date updated_on) {
        Updated_on = updated_on;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCreated_by() {
        return Created_by;
    }

    public void setCreated_by(String created_by) {
        Created_by = created_by;
    }

    public Date getCreated_on() {
        return Created_on;
    }

    public void setCreated_on(Date created_on) {
        Created_on = created_on;
    }
}
