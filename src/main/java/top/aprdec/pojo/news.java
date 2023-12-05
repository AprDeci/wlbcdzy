package top.aprdec.pojo;

public class news {
    String img;
    String title;
    String text;
    int id;
    String type;

    public news() {
    }

    public news(String img, String title, String text,String type) {
        this.img = img;
        this.title = title;
        this.text=text;
        this.type = type;
    }
    public  news(int id,String img, String title, String text,String type) {
        this.img = img;
        this.title = title;
        this.text=text;
        this.type = type;
        this.id=id;
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
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "news{img = " + img + ", title = " + title + ",type ="+type+", text = " + text + ", id = " + id + "}";
    }

    /**
     * 获取
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}

