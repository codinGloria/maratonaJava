package com.codingloria.oop.association.test;

import com.codingloria.oop.association.domain.School;
import com.codingloria.oop.association.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Jiraiya Sensei");
        Teacher teacher2 = new Teacher("Kakashi Sensei");
        Teacher[] teachers = {teacher1, teacher2};
        School school1 = new School("Konoha Ninja Academy", teachers);

        school1.print();
    }
}
