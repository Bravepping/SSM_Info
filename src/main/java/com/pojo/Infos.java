package com.pojo;

public class Infos {
    private Integer card;
    private String name;
    private Integer age;
    private String tress;

    public Integer getCard() {
        return card;
    }

    public void setCard(Integer card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTress() {
        return tress;
    }

    public void setTress(String tress) {
        this.tress = tress;
    }

    @Override
    public String toString() {
        return "Infos{" +
                "card=" + card +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", tress='" + tress + '\'' +
                '}';
    }
}