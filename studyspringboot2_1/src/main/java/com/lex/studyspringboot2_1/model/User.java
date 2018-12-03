package com.lex.studyspringboot2_1.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class User {

    @NotEmpty(message = "名前をご入力ください")
    private String name;
    @Max(value = 100, message = "１００以上入力できない")
    @Min(value = 18, message = "１８歳以上じゃないとだめだよ")
    private int age;
    @NotEmpty(message = "パスワードをご入力ください")
    @Length(min = 6, message = "６桁以上ご入力ください")
    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
