package model;

public class EmailAddress {
    private String type;
    private String address;

    public EmailAddress(String type, String address) {
        this.type = type;
        this.address = address;
    }

    public EmailAddress() {}

    public String getEmailAddress() {
        return address;
    }

    public void setEmailAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + ": " + address;
    }
}
