package com.codingloria.exercicios.oop.association.domain;

public class Professor {
    private String name;
    private String specialty;
    private Seminar[] seminars;

    public Professor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Professor(String name, String specialty, Seminar[] seminars) {
        this.name = name;
        this.specialty = specialty;
        this.seminars = seminars;
    }

    public void print(){
        System.out.println("--------------------------------");
        System.out.println("Professor: " + this.name);
        System.out.println("Specialty: " + this.specialty);
        if (this.seminars == null) return;
        System.out.println("#### Seminars ####");
        for (Seminar seminar : this.seminars) {
            System.out.println("Title: " + seminar.getTitle());
            System.out.println("Location: " + seminar.getLocation().getAddress());

            if (seminar.getStudents() == null || seminar.getStudents().length==0) continue;
            System.out.println("#### Students ####");
            for (Student student : seminar.getStudents()) {
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
