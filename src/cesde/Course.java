package cesde;

import java.util.List;
import java.util.Scanner;

public class Course {

    Scanner sc = new Scanner(System.in);

 //Atributos
    private int id;
    private String name;
    private int school;
    private boolean teacher;
    private int startDate;
    private int endDate;




    // Constructores

    // Constructor vacío
    public Course() {
    }

    // Constructor personalizado
    public Course(String name) {
        this.name = name;
    }

    // Constructor con todos los argumentos
    public Course(int id, String name, int school, boolean teacher, int startDate, int endDate) {
        this.id = id;
        this.name = name;
        this.school = school;
        this.teacher = teacher;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //  Getters And Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchool() {
        return school;
    }

    public void setSchool(int school) {
        this.school = school;
    }

    public boolean isTeacher() {
        return teacher;
    }

    public void setTeacher(boolean teacher) {
        this.teacher = teacher;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    //  Métodos

    public Course createCourse(Course course) {
        System.out.println("Ingrese el id del curso:");
        int id = sc.nextInt();
        course.setId(id);
        sc.nextLine();

        System.out.println("Ingrese el nombre del curso:");
        String name = sc.nextLine();
        course.setName(name);

        System.out.println("Ingrese el id de la escuela:");
        int school = sc.nextInt();
        course.setSchool(school);

        System.out.println("¿Tiene profesor asignado? (true/false):");
        boolean teacher = sc.nextBoolean();
        course.setTeacher(teacher);

        System.out.println("Ingrese fecha de inicio (formato numérico):");
        int start = sc.nextInt();
        course.setStartDate(start);

        System.out.println("Ingrese fecha de fin (formato numérico):");
        int end = sc.nextInt();
        course.setEndDate(end);

        return course;
    }

    public void getCourseById(int id) {
        if (id == this.id) {
            System.out.println("ID: " + this.id + "\n" +
                    "Nombre: " + this.name + "\n" +
                    "Escuela: " + this.school + "\n" +
                    "Profesor: " + (this.teacher ? "Asignado" : "No asignado") + "\n" +
                    "Fecha Inicio: " + this.startDate + "\n" +
                    "Fecha Fin: " + this.endDate);
        } else {
            System.out.println("Curso no encontrado");
        }
    }

    public List<Course> getAllCourse() {
        // En una aplicación real, esto devolvería una lista de la DB o un Array
        return null;
    }

    public Course updateCourse(Course course) {
        // Lógica para actualizar (similar a create)
        return course;
    }

    public void deleteCourse(int id) {

    }
}