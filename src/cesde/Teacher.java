package cesde;

import java.util.List;
import java.util.Scanner;

public class Teacher {

        Scanner sc = new Scanner(System.in);

        // 1. Atributos (Privados)
        private int id;
        private String name;
        private String email;
        private String specialty;
        private boolean status; // Cambiado 'estado' a 'status' para seguir el estándar de las otras clases




        // Constructores

        // Constructor vacío
        public Teacher() {
        }

        // Constructor personalizado
        public Teacher(String email) {
                this.email = email;
        }

        // Constructor completo
        public Teacher(int id, String name, String email, String specialty, boolean status) {
                this.id = id;
                this.name = name;
                this.email = email;
                this.specialty = specialty;
                this.status = status;
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

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getSpecialty() {
                return specialty;
        }

        public void setSpecialty(String specialty) {
                this.specialty = specialty;
        }

        public boolean isStatus() {
                return status;
        }

        public void setStatus(boolean status) {
                this.status = status;
        }

        // Métodos

        public Teacher createTeacher(Teacher teacher) {
                System.out.println("--- Registro de Profesor ---");

                System.out.println("Ingrese el ID:");
                teacher.setId(sc.nextInt());
                sc.nextLine();

                System.out.println("Ingrese el nombre completo:");
                teacher.setName(sc.nextLine());

                System.out.println("Ingrese el email:");
                teacher.setEmail(sc.nextLine());

                System.out.println("Ingrese la especialidad (Java, SQL, etc.):");
                teacher.setSpecialty(sc.nextLine());

                System.out.println("¿Está activo? (true/false):");
                teacher.setStatus(sc.nextBoolean());
                sc.nextLine();

                return teacher;
        }

        public void getTeacherById(int id) {
                if (id == this.id) {
                        System.out.println("Información del Profesor:");
                        System.out.println("ID: " + this.id);
                        System.out.println("Nombre: " + this.name);
                        System.out.println("Email: " + this.email);
                        System.out.println("Especialidad: " + this.specialty);
                        System.out.println("Estado: " + (this.status ? "Activo" : "Inactivo"));
                } else {
                        System.out.println("Profesor no encontrado.");
                }
        }

        public List<Teacher> getAllTeacher() {
                return null;
        }

        public Teacher updateTeacher(Teacher teacher) {
                return teacher;
        }

        public void deleteTeacher(int id) {

        }
}