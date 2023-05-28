public class AuthenticationInfo {
    private String URL, username , password;

    AuthenticationInfo(String URl,String username,String password){
        this.URL=URl;
        this.username=username;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
