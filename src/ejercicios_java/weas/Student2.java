package Java.src.ejercicios_java.weas;
public class Student2 {
    
    // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.

    // Atributos
    private int grade;

    // Constructor
    public Student2(int grade) {
        this.grade = grade;
    }

    // Getters
    public void isPased() {
        if (grade >= 60) {
            System.out.println("Calificacion aprobada");
        } else {
            System.out.println("Calificacion reprobada");
        }
    }

    // Setters
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
