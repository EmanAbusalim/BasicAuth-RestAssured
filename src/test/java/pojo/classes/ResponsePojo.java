package pojo.classes;

public class ResponsePojo {
    private String instructor;
    private String url;
    private String linkedIn;
    private Courses courses;
private String services;
private String expertise;
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getExpertise() {
        return expertise;
    }

    public Courses getCourses() {
        return courses;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public String getUrl() {
        return url;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }
    public String getServices() {
        return services;
    }
    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }
}
