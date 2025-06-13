package oauth_pojo_classes;

public class WebAutomation {
    public void setPrice(String price) {
        this.price = price;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    private String courseTitle;

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getPrice() {
        return price;
    }

    private String price;
}
