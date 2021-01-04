package com.example.demo.pojo;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;

public class Person {
    private String name;
    private String age;
    private Boolean happy;
    private Data birthday;
    private Map<String,Object> maps;
    private List<Object> lists;

    public Person() {
    }

    public Person(String name, String age, Boolean happy, Data birthday, Map<String, Object> maps, List<Object> lists) {
        this.name = name;
        this.age = age;
        this.happy = happy;
        this.birthday = birthday;
        this.maps = maps;
        this.lists = lists;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Boolean getHappy() {
        return happy;
    }

    public Data getBirthday() {
        return birthday;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setHappy(Boolean happy) {
        this.happy = happy;
    }

    public void setBirthday(Data birthday) {
        this.birthday = birthday;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }
}
