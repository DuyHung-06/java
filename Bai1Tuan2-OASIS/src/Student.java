public class Student {
    private String name;

    private String id;

    private String group;

    private String email;
    //getter

    public String getName() {
       return name;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // constructor khong doi so

    /**
     * constructor for student.
     */
    public Student() {
       name = "Student";
       id = "000";
       group = "K62CB";
       email = "uet@vnu.edu.vn";
    }
    // constructor co doi so nhung khac nhau ve signature

    /**
     *TEXT note.
     * @param email TEXT note
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * Text to text.
     *
     * @param email text to text
     */
    public Student(String name, String id, String group, String email) {
       this.name = name;
       this.id = id;
       this.group = group;
       this.email = email;
    }

    /**
     *Info.
     * @return Info
     */
    public String getInfo() {
       return name + " - " + id + " - " + group + " - "  + email;
    }

    /**
     *them theo student.
     * @param s them theo student
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

}
