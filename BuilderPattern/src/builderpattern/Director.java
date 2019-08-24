package builderpattern;

public class Director {

    public Director() {
    }

    // --------------------------
    public void construir(BuilderMessage builder) {
        builder.newMessage();
        builder.prepareMessage();
        builder.createMessage();
        builder.sendMessage();

    }
}
