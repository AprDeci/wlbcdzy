package top.aprdec.pojo;

public class product {
    String img;
    String name;
    String type;
    String model;
    String function;
    double price;
    int sales;
    String introduction;

    public product() {
    }

    public product(String img, String name, String type, String model, String function, double price, int sales, String introduction) {
        this.img = img;
        this.name = name;
        this.type = type;
        this.model = model;
        this.function = function;
        this.price = price;
        this.sales = sales;
        this.introduction = introduction;
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * 获取
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 获取
     * @return function
     */
    public String getFunction() {
        return function;
    }

    /**
     * 设置
     * @param function
     */
    public void setFunction(String function) {
        this.function = function;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return sales
     */
    public int getSales() {
        return sales;
    }

    /**
     * 设置
     * @param sales
     */
    public void setSales(int sales) {
        this.sales = sales;
    }

    /**
     * 获取
     * @return introduction
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置
     * @param introduction
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String toString() {
        return "product{img = " + img + ", name = " + name + ", type = " + type + ", model = " + model + ", function = " + function + ", price = " + price + ", sales = " + sales + ", introduction = " + introduction + "}";
    }
}
