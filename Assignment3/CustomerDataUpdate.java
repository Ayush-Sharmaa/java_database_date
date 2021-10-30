package Assignment3;

import java.util.Date;

public class CustomerDataUpdate {
    public Integer cid;
    public String street;
    public String city;
    public String state;
    public Integer zipcode;
    public String product_name;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }



    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Date getUpdated_on() {
        return Updated_on;
    }

    public void setUpdated_on(Date updated_on) {
        Updated_on = updated_on;
    }

    public String getUpdated_by() {
        return Updated_by;
    }

    public void setUpdated_by(String updated_by) {
        Updated_by = updated_by;
    }

    public Date Updated_on;
    public String Updated_by;
}
