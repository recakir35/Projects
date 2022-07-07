public class Person extends Accountancy {
    String name;
    String surname;
    String tcno;
    String phone;
    String dateofbirth;

    public Person() {
    }

    public Person(String name, String surname, String tcno, String phone, String dateofbirth) {
        this.name = name;
        this.surname = surname;
        this.tcno = tcno;
        this.phone = phone;
        this.dateofbirth = dateofbirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "salary=" + salary +
                ", payment=" + payment +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", tcno='" + tcno + '\'' +
                ", phone='" + phone + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                "} " + super.toString();
    }
}
