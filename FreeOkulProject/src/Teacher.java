public class Teacher extends Person {
String squad;
String sicilNo;


    public Teacher() {
    }

    public Teacher(String name, String surname, String tcno, String phone, String dateofbirth, String squad, String sicilNo) {
        super(name, surname, tcno, phone, dateofbirth);
        this.squad = squad;
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return  "salary=" + salary +
                ", payment=" + payment +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", tcno='" + tcno + '\'' +
                ", phone='" + phone + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                ", squad='" + squad + '\'' +
                ", sicilNo='" + sicilNo + '\'' + super.toString();
    }
}
