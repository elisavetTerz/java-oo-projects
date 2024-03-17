package gr.aueb.cf.ch19.dto;

public class UserUpdateDTO extends BaseDTO {
    private String firstname;
    private String lastname;
    private String ssn;


    public UserUpdateDTO() {
    }

    public UserUpdateDTO(String firstname, String lastname, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
