package top.aprdec.pojo;

public class news {
    String img;
    String title;
    String text;
    String id;

    public news() {
    }

    public news(String img, String title, String text, String id) {
        this.img = img;
        this.title = title;
        this.text = text;
        this.id = id;
    }

    /**
     * 获取
     * @return img
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * 设置
     * @param text
     */
    public void setText(String text) {
        this.text = text;
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

    public String toString() {
        return "news{img = " + img + ", title = " + title + ", text = " + text + ", id = " + id + "}";
    }
}

