package builderpattern;

public abstract  class BuilderMessage {

    protected Message message;



    // ------------------------------
    public Message getMessage() {
        return this.message;
    }

    // ------------------------------
    public void newMessage() {
        this.message = new Message("Sender Message", "Destination", "This is a message test!!!");
    }

    // ------------------------------------

    public abstract void prepareMessage();

    public abstract void createMessage();

    public abstract void sendMessage();

}
