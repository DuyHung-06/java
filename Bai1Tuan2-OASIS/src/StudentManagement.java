
import java.util.LinkedHashSet;
import java.util.Set;

public class StudentManagement {
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    private final Student[] students = new Student[100];

    private int soStudent = 0;

    /**
     * add.
     * @param newStudent add
     */
    public void addStudent(Student newStudent) {
        if (soStudent < 100) {
            students[soStudent] = newStudent;
            soStudent++;
        } else {
            System.out.println("Student is full");
        }
    }

    /**
     * next.
     * @return studentByGroup next
     */
    public String studentsByGroup() {
        StringBuilder builder = new StringBuilder();
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < soStudent; i++) {
            if (students[i] != null) {
                set.add(students[i].getGroup());
            }
        }

        for (String s : set) {
            builder.append(s);
            builder.append('\n');
            for (int j = 0; j < soStudent; j++) {
                if (students[j] != null && (students[j].getGroup()).equals(s)) {
                    builder.append(students[j].getInfo());
                    builder.append('\n');
                }
            }
        }
        return builder.toString();
    }

    /**
     * next day.
     * @param id next day
     */
    public void removeStudent(String id) {
        for (int i = 0; i < soStudent; i++) {
            if ((students[i].getId()).equals(id)) {
                int j = i;
                while (j < soStudent) {
                    students[j] = students[j + 1];
                    j++;
                }
                students[soStudent] = null;
                 soStudent--;
                 break;
            }
        }
    }

}
