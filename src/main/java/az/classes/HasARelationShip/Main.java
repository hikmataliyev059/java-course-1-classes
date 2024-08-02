package az.classes.HasARelationShip;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Ali", 15);
        Student student2 = new Student("Aysel", 16);

        School school = new School("School-1");
        school.addStudent(student1);
        school.addStudent(student2);

        System.out.println(school.getName());
        for (Student student : school.getStudents()) {
            System.out.println("- " + student.getName() + ", " + student.getAge() + " years old");
        }

        System.out.println("\n After deleting the school:");
        System.out.println("Students:");

        System.out.println("- " + student1.getName() + ", " + student1.getAge() + " years old");
        System.out.println("- " + student2.getName() + ", " + student2.getAge() + " years old");
    }
}
