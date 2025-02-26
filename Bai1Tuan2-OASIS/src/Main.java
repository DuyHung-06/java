
public class Main {
    /**
     * Quan ly sinh vien.
     *
     * @param args quan ly sinh vien.
     */
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Student student1 = new Student("Nguyen Van An", "17020001", "K62CC", "17020001@vnu.edu.vn");
        studentManagement.addStudent(student1);
        Student student2 = new Student("Nguyen Van B", "17020002", "K62CC", "17020002@vnu.edu.vn");
        studentManagement.addStudent(student2);
        Student student3 = new Student("Nguyen Van C", "17020003", "K62CB", "17020003@vnu.edu.vn");
        studentManagement.addStudent(student3);
        Student student4 = new Student("Nguyen Van D", "17020004", "K62CB", "17020004@vnu.edu.vn");
        studentManagement.addStudent(student4);
        System.out.println(StudentManagement.sameGroup(student1, student2));
        System.out.println(studentManagement.studentsByGroup());
        studentManagement.removeStudent("17020004");
        System.out.println(studentManagement.studentsByGroup());

    }
}