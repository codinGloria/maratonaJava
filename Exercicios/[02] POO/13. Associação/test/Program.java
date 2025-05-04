package com.codingloria.exercicios.oop.association.test;

import com.codingloria.exercicios.oop.association.domain.Location;
import com.codingloria.exercicios.oop.association.domain.Professor;
import com.codingloria.exercicios.oop.association.domain.Seminar;
import com.codingloria.exercicios.oop.association.domain.Student;

public class Program {
    public static void main(String[] args) {
        Location location = new Location("Rua 1, 123");

        Student student1 = new Student("Alice", 23);
        Student student2 = new Student("Bob", 24);

        Professor professor = new Professor("Dr. Smith", "Computer Science");

        Student[] students = {student1, student2};

        Seminar seminar = new Seminar("Java Programming", students, location);

        Seminar[] seminars = {seminar};

        professor.setSeminars(seminars);
        professor.print();
    }
}
