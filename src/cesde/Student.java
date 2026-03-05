package cesde;

import java.util.List;
import java.util.Scanner;

public class Student {

    Scanner sc = new Scanner(System.in);

    //atributos
    private int id;
    protected String name;
    private String email;
    private String  lastName;
    private boolean status;

    //constructores
    public Student(){   //constructor vacio

    }



    public Student (String email){   //constructor personalizada
        this.email=email;
    }

    public Student(int id, String name, String email, String lasName, boolean status) { //constructor de todos los argumentos
        this.id = id;
        this.name = name;
        this.lastName=lasName;
        this.email = email;
        this.status = status;
    }

    //Getters And Setters


    public int getId(){
        return this.id;
    }


    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //metodos
    public Student createStudent (Student student){

        System.out.println("ingrese el id del estudiante");
        int id = sc.nextInt();
        student.setId(id);
        sc.nextLine();

        System.out.println("Ingrese el Nombre del Estudiante");
        String name = sc.nextLine();
        student.setName(name);

        System.out.println("Ingrese el apellido del estudiante");
        String lastName = sc.nextLine();
        student.setLastName(lastName);

        return student;
    }

    public void getStudentById(int id){

        if(id==this.id){
            System.out.println("id: " + this.id+"\n" +
                    "nombre: " + this.name + "\n" +
                    "apellido: " + this.lastName + "\n" +
                    "email: " + this.email + "\n" +
                    "status: ");
        }else{
            System.out.println("Id no encontrado");
        }
    }

    public List<Student> getAllStudent(){
        return null;
    }

    public Student updateStudent(Student student){
        return student;
    }

    public void deleteStudent(int id){

    }

}
