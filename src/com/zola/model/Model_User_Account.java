package com.zola.model;

public class Model_User_Account {

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getAvatarPath() {
        return AvatarPath;
    }

    public void setAvatarPath(String AvatarPath) {
        this.AvatarPath = AvatarPath;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

  public Model_User_Account(int userID, String userName, String gender, String image, boolean status, String AvatarPath) {
        this.userID = userID;
        this.userName = userName;
        this.gender = gender;
        this.image = image;
        this.status = status;
        this.AvatarPath = AvatarPath;
    }



    private int userID;
    private String userName;
    private String gender;
    private String image;
    private boolean status;
    private String AvatarPath;

}
