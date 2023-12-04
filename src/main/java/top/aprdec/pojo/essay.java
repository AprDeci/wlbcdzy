package top.aprdec.pojo;

public class essay {
    String title;
    String text;

    public essay() {
    }

    public essay(String title, String text) {
        this.title = title;
        this.text = text;
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

    public String toString() {
        return "essey{title = " + title + ", text = " + text + "}";
    }
}
