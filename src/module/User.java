package module;

public class User {
    private String username;
    private String passwords;
    private String first_name;
    private String last_name;
    private String mobile_number;
    public String getUsername() {
        return username;
    }

    public User(String username, String passwords, String first_name, String last_name, String mobile_number) {
        this.username = username;
        this.passwords = passwords;
        this.first_name = first_name;
        this.last_name = last_name;
        this.mobile_number = mobile_number;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", passwords='" + passwords + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", mobile_number='" + mobile_number + '\'' +
                '}';
    }
}
