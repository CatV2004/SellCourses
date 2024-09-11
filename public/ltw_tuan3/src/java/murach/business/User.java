package murach.business;
import java.io.Serializable;
public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dateBirth;
    private String comboBox;
    private String checkBox;
    private String contact;
    public User () 
    {
        firstName = "";
        lastName = "";
        email = "";
        dateBirth = "";
        comboBox = "";
        checkBox = "";
        contact = "";
    
    }
    public User (String firstName, String lastName, String email, String dateBirth, String comboBox, String checkBox, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateBirth = dateBirth;
        this.comboBox = comboBox;
        this.checkBox = checkBox;
        this.contact = contact;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }
    public String getComboBox() {
        return comboBox;
    }

    public void setComboBox(String comboBox) {
        this.comboBox = comboBox;
    }
    public String getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(String checkBox) {
        this.checkBox = checkBox;
    }
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}