package main;

import cesde.*;

public class Main {

    public static void main(String[] args) {

        School miEscuela = new School();
        miEscuela.createSchool(miEscuela);
        // ID, Nombre, Director


        Teacher miProfesor = new Teacher();
        miProfesor.createTeacher(miProfesor);


        Student miEstudiante = new Student();
        miEstudiante.createStudent(miEstudiante);

        //resultado
        System.out.println("\n--- RESUMEN DEL REGISTRO ---");
        miEscuela.getSchoolById(miEscuela.getId());
        System.out.println("----------------------------");
        miProfesor.getTeacherById(miProfesor.getId());
        System.out.println("----------------------------");
        miEstudiante.getStudentById(miEstudiante.getId());
    }
}