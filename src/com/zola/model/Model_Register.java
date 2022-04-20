package com.zola.model;

public class Model_Register {

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Model_Register(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Model_Register(String userName, String password, String gender, String AvatarPath) {
        this.userName = userName;
        this.password = password;
        this.gender = gender;
//        this.Description = Description;
        this.AvatarPath = AvatarPath;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
//    
//    public String getImageString() {
//        return imageString;
//    }
//
//    public void setImageString(String imageString) {
//        this.imageString = imageString;
//    }

//    public String getDescription() {
//        return Description;
//    }
//
//    public void setDescription(String Description) {
//        this.Description = Description;
//    }
//
    public String getAvatarPath() {
        return AvatarPath;
    }

    public void setAvatarPath(String AvatarPath) {
        this.AvatarPath = AvatarPath;
    }
    
    

    public Model_Register() {
    }

    private String userName;
    private String password;
    private String gender;
    //private String imageString;
//    private String Description;
    private String AvatarPath;


    
}
