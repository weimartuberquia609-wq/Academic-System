package cesde;

import java.util.List;
import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    //atributos
    private int id;
    private String name;
    private String lastName;
    private String email;
    private Course  curso;
    private boolean status;

    //Constructores

    public Student(){ // constructor vacio

    }

    public Student(String email){ // constructor personalizado
        this.email = email;
    }

    public Student(int id, String name, String email, Course curso, boolean status) { // Constructor con todos los argumentos
        this.id = id;
        this.name = name;
        this.lastName =lastName;
        this.email = email;
        this.curso = curso;
        this.status = status;
    }
    // Getters and Setters
    //id
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id=id;
    }

    //name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //lastName
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //metodos
    public Student createStudent (Student student){
        System.out.println("Ingrese el id del Estudiante");
        int id = sc.nextInt();
        student.setId(id);
        sc.nextLine();

        System.out.println("Ingrese el nombre del Estudiante");
        String name = sc.nextLine();
        student.setName(name);

        System.out.println("Ingrese el apellido del estudiante");
        String lastName = sc.nextLine();
        student.setLastName(lastName);
        return student;
    }

    public void getStudentById(int id){
        if(id==this.id){
            System.out.println("id:" + this.id + "\n" +
                    "Nombre: "+ this.name + "\n" +
                    "Apellido:" + this.lastName+ "\n" +
                    "email: "+ this.email +"\n"+
                    "status");
        }else{
            System.out.println("Id no encontrado");
        }
    }

    public List<Student> getAllStudent(){
        return null;
    }

    public Student updateStudent(Student student){
        return null;
    }

    public void deleteStudent(int id){

    }
}
