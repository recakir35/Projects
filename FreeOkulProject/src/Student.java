public class Student extends Person {
    String classroom;
    String schollno;

    public Student() {
    }

    public Student(String name, String surname, String tcno, String phone, String dateofbirth, String classroom, String schollno) {
        super( name, surname, tcno, phone, dateofbirth);
        this.classroom = classroom;
        this.schollno = schollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "salary=" + salary +
                ", payment=" + payment +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", tcno='" + tcno + '\'' +
                ", phone='" + phone + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", classroom='" + classroom + '\'' +
                ", schollno='" + schollno + '\'' +
                "} " + super.toString();
    }
}
