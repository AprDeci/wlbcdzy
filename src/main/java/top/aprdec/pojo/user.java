package top.aprdec.pojo;

public class user {
    String id;
    String username;
    String password;
    String identity;

    public user() {
    }

    public user(String username, String password, String identity) {
        this.username = username;
        this.password = password;
        this.identity = identity;
    }

    public user(String id, String username, String password, String identity) {
        this.id = id;
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
    public String getIdentity() {
        return identity;
    }

    /**
     * 设置
     * @param identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String toString() {
        return "user{username = " + username + ", password = " + password + ", identity = " + identity + "}";
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }
}
