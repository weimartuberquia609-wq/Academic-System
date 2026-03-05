package cesde;

import java.util.List;
import java.util.Scanner;

public class School {

    Scanner sc = new Scanner(System.in);

    //Atributos
    private int id;
    private String nameSchool;
    private String director;




    //Constructores

    // Constructor vacío
    public School() {
    }

    // Constructor personalizado (por nombre de la escuela)
    public School(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    // Constructor completo
    public School(int id, String nameSchool, String director) {
        this.id = id;
        this.nameSchool = nameSchool;
        this.director = director;
    }

    // Getters And Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Métodos

    public School createSchool(School school) {
        System.out.println("--- Registro de Institución ---");

        System.out.println("Ingrese el ID de la escuela:");
        school.setId(sc.nextInt());
        sc.nextLine(); // Limpiamos el buffer porque lo que sigue es un String

        System.out.println("Ingrese el nombre de la escuela:");
        school.setNameSchool(sc.nextLine());

        System.out.println("Ingrese el nombre del director:");
        school.setDirector(sc.nextLine());

        return school;
    }

    public void getSchoolById(int id) {
        if (id == this.id) {
            System.out.println("Información de la Escuela:");
            System.out.println("ID: " + this.id);
            System.out.println("Nombre: " + this.nameSchool);
            System.out.println("Director: " + this.director);
        } else {
            System.out.println("Escuela con ID " + id + " no encontrada.");
        }
    }

    public List<School> getAllSchool() {
        return null;
    }

    public School updateSchool(School school) {
        return school;
    }

    public void deleteSchool(int id) {
    }
}