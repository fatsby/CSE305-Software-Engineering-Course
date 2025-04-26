package models;

public class User {
    private String userId;
    private String password;
    private String email;
    private String userType;
    public User(String userId, String password, String email, String userType) {
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }
    public void resetPass(){
        this.password = "";
    }
    public User createUser(){
        return new User(userId, password, email, userType);
    }
}
