package com.xbmu.domin;

public class UserInfo {
    private Integer uId;
    private String uSex;
    private String uBorn;
    private String uName;
    private String uBirthplace;
    private String uType;
    private String uEmail;
    private String uPlaceResidence;
    private String uPersonalDescription;
    public UserInfo(Object o, String uSex, String uBorn, String uName, String uBirthplace, String uType, String uEmail, String uPlaceResidence, String uPersonalDescription) {
    }

    public UserInfo(Integer uId, String uSex, String uBorn, String uName, String uBirthplace, String uType, String uEmail, String uPlaceResidence, String uPersonalDescription) {
        this.uId = uId;
        this.uSex = uSex;
        this.uBorn = uBorn;
        this.uName = uName;
        this.uBirthplace = uBirthplace;
        this.uType = uType;
        this.uEmail = uEmail;
        this.uPlaceResidence = uPlaceResidence;
        this.uPersonalDescription = uPersonalDescription;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    public String getuBorn() {
        return uBorn;
    }

    public void setuBorn(String uBorn) {
        this.uBorn = uBorn;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuBirthplace() {
        return uBirthplace;
    }

    public void setuBirthplace(String uBirthplace) {
        this.uBirthplace = uBirthplace;
    }

    public String getuType() {
        return uType;
    }

    public void setuType(String uType) {
        this.uType = uType;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuPlaceResidence() {
        return uPlaceResidence;
    }

    public void setuPlaceResidence(String uPlaceResidence) {
        this.uPlaceResidence = uPlaceResidence;
    }

    public String getuPersonalDescription() {
        return uPersonalDescription;
    }

    public void setuPersonalDescription(String uPersonalDescription) {
        this.uPersonalDescription = uPersonalDescription;
    }

    @Override
    public String toString() {
        return "User_info{" +
                "uId=" + uId +
                ", uSex='" + uSex + '\'' +
                ", uBorn='" + uBorn + '\'' +
                ", uName='" + uName + '\'' +
                ", uBirthplace='" + uBirthplace + '\'' +
                ", uType='" + uType + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", uPlaceResidence='" + uPlaceResidence + '\'' +
                ", uPersonalDescription='" + uPersonalDescription + '\'' +
                '}';
    }
}
