package cesde;

import java.util.List;
import java.util.Scanner;

public class ClassRoom {

        Scanner sc = new Scanner(System.in);


        //  Atributos
        private int id;
        private int classroomNumber; // Cambiado a classroomNumber para evitar confusión con el nombre de la clase
        private int floor;
        private boolean status;
        private int capacity;


        //  Constructores

        // Constructor vacío
        public ClassRoom() {
        }

        // Constructor personalizado (por ejemplo, solo por número de aula)
        public ClassRoom(int classroomNumber) {
                this.classroomNumber = classroomNumber;
        }

        // Constructor con todos los argumentos
        public ClassRoom(int id, int classroomNumber, int floor, boolean status, int capacity) {
                this.id = id;
                this.classroomNumber = classroomNumber;
                this.floor = floor;
                this.status = status;
                this.capacity = capacity;
        }

        // Getters And Setters

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public int getClassroomNumber() {
                return classroomNumber;
        }

        public void setClassroomNumber(int classroomNumber) {
                this.classroomNumber = classroomNumber;
        }

        public int getFloor() {
                return floor;
        }

        public void setFloor(int floor) {
                this.floor = floor;
        }

        public boolean isStatus() {
                return status;
        }

        public void setStatus(boolean status) {
                this.status = status;
        }

        public int getCapacity() {
                return capacity;
        }

        public void setCapacity(int capacity) {
                this.capacity = capacity;
        }

        // Métodos

        public ClassRoom createClassRoom(ClassRoom classroom) {
                System.out.println("--- Registro de Aula ---");

                System.out.println("Ingrese el ID del registro:");
                classroom.setId(sc.nextInt());
                sc.nextLine();

                System.out.println("Ingrese el número del aula:");
                classroom.setClassroomNumber(sc.nextInt());
                sc.nextLine();

                System.out.println("Ingrese el piso (floor):");
                classroom.setFloor(sc.nextInt());
                sc.nextLine();

                System.out.println("Ingrese la capacidad máxima:");
                classroom.setCapacity(sc.nextInt());
                sc.nextLine();

                System.out.println("¿Está habilitada? (true/false):");
                classroom.setStatus(sc.nextBoolean());
                sc.nextLine();

                return classroom;
        }
        public void getClassRoomById(int id) {
                if (id == this.id) {
                        System.out.println("Consulta de Aula:");
                        System.out.println("ID: " + this.id);
                        System.out.println("Número Aula: " + this.classroomNumber);
                        System.out.println("Piso: " + this.floor);
                        System.out.println("Capacidad: " + this.capacity);
                        System.out.println("Estado: " + (this.status ? "Disponible" : "Ocupada/Mantenimiento"));
                } else {
                        System.out.println("Aula no encontrada.");
                }
        }

        public List<ClassRoom> getAllClassRoom() {
                return null; // Aquí se iría la lista general
        }

        public ClassRoom updateClassRoom(ClassRoom classroom) {
                return classroom;
        }

        public void deleteClassRoom(int id) {

        }
}
