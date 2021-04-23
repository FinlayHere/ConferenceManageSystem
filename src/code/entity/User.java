package code.entity;

import code.transfer.UserTransfer;

public class User {
    private Integer id;
    private String email;
    private String password;
    private String role;

    public User(Integer id, String email, String password, String role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean passwordEqualTo(String password){
        return password.equals(this.password);
    }

    public UserTransfer getDataTransfer(){
        return new UserTransfer();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public String getUserLine() {
        return  "id : " + id +
                ", email : " + email +
                ", password : " + password +
                ", role : " + role;
    }

    public String getCsvLine() {
        return String.format("%s,%s,%s,%s", id, email, password, role);
    }
}