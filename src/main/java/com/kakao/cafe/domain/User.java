package com.kakao.cafe.domain;

public class User {

    private long userIdx;
    private String userName;
    private String userPassword;
    private String userEmail;

    public long getUserIdx() {
        return userIdx;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserIdx(long userIdx) {
        this.userIdx = userIdx;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
