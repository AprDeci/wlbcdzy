package top.aprdec.pojo;

public class user {
    String username;
    String password;
    int identity; //身份 1-普通用户 2-vip 3-管理员

    public user() {
    }

    public user(String username, String password, int identity) {
        this.username = username;
        this.password = password;
        this.identity = identity;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return identity
     */
    public int getIdentity() {
        return identity;
    }

    /**
     * 设置
     * @param identity
     */
    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public String toString() {
        return "user{username = " + username + ", password = " + password + ", identity = " + identity + "}";
    }
}
