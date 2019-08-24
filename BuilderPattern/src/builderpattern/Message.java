package builderpattern;

public class Message {

    private String sender;
    private String addressee;
    private String message;

    // -------------------------------------------


    public Message(String sender, String addressee, String message) {
        this.sender = sender;
        this.addressee = addressee;
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
