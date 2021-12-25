import java.util.Scanner ;
public class Account implements Comparable<Account> {
    private long id ;
    private String Fullname ;
    private String username ;
    private String password ;
    private String email ;
    private String phone ;
    private String createdAt ;

    public Account(long id, String Fullname, String username, String password, String email, String phone, String createdAt) {
        this.id = id;
        this.Fullname = Fullname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.createdAt = createdAt;
    }

    public Account() {
    }
    public void setId(long id) {
        this.id = id;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return Fullname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCreateAt() {
        return createdAt;
    }
    public void output() {
        System.out.println("id: " + id +
                ", full name: " + Fullname +
                ", username: " + username +
                ", password: " + password +
                ", email: " + email +
                ", phone: " + phone +
                ", create at: " + createdAt);
    }


    @Override
    public int compareTo(Account o) {
        return getUsername().compareTo(o.getUsername());
    }
}
