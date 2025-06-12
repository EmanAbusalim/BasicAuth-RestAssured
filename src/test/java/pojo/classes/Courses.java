package pojo.classes;

import java.util.List;

public class Courses {
    // the class called WebAutomation i should create an object from it but
    //in the json contains three object thats why i createsd a list of webautomation
    private List<WebAutomation> webAutomation;
    private List<Api> api;
    private List<Mobile> mobile;
    public void setWebAutomation(List<WebAutomation> webAutomation) {
        this.webAutomation = webAutomation;
    }

    public void setMobile(List<Mobile> mobile) {
        this.mobile = mobile;
    }

    public List<WebAutomation> getWebAutomation() {
        return webAutomation;
    }

    public List<Api> getApi() {
        return api;
    }

    public List<Mobile> getMobile() {
        return mobile;
    }

    public void setApi(List<Api> api) {
        this.api = api;
    }


}
