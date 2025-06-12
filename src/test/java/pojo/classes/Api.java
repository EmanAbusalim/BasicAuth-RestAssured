package pojo.classes;

public class Api {
    public void setPrice(String price) {
        this.price = price;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getPrice() {
        return price;
    }

    private String courseTitle;
    private String price;

}
