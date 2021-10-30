package Assignment2;

import java.util.Date;

public class UpdateEmployee {
    public Integer id;
    public String name;
    public Double salary;
    public String Updated_by;
    public Date Updated_on;

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
}
