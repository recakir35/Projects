package Middle_Projects.Q02_Kullanıcı_;

public class User {
    private int userid;
    private String userName;
    private String pasword;
    private boolean active;
    private boolean signedIn;

    public User() {
    }

    public User(int userid, String userName, String pasword, boolean active, boolean signedIn) {
        this.userid = userid;
        this.userName = userName;
        this.pasword = pasword;
        this.active = active;
        this.signedIn = signedIn;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public String toString() {
        return  "Userid: " + userid +
                ", UserName: " + userName +
                ", Pasword: " + pasword  +
                ", Active: " + active +
                ", SignedIn: " + signedIn;
    }
}
