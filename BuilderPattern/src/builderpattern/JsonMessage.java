package builderpattern;

public class JsonMessage extends BuilderMessage {

    public JsonMessage(Message json) {
    }


    @Override
    public void prepareMessage() {
        System.out.println("Prepared");
    }

    @Override
    public void createMessage() {
        System.out.println("Created");
    }

    @Override
    public void sendMessage() {
        JSONObject jsonObject = new JSONObject(jsonString);
        // To string method prints it with specified indentation
        System.out.println(jsonObject.toString(4));
    }
}
