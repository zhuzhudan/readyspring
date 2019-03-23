package com.study.spring.ready.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
    public Student(String name, School school){
        this.name = name;
        this.school = school;
    }

    public Student(){

    }
    private String name;
    private int age;
    private School school;

    private Set sets;
    private List lists;
    private Map map;
    private Properties properties;

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

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Set getSets() {
        return sets;
    }

    public void setSets(Set sets) {
        this.sets = sets;
    }

    public List getLists() {
        return lists;
    }

    public void setLists(List lists) {
        this.lists = lists;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
