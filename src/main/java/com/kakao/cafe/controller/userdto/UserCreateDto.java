package com.kakao.cafe.controller.userdto;

public class UserCreateDto {

    private final String userName;
    private final String userPassword;
    private final String userEmail;

    public UserCreateDto(String userName, String userPassword, String userEmail) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }
}