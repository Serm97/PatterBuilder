/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 * @author seramirez
 */
public class BuilderPattern {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
        Director objFabrica = new Director();
        
        Message message = new Message("Sender Message", "Destination", "This is a message test!!!");
        
        // Objects ConcreteBuilder
        BuilderMessage email = new EmailMessage(message);
        BuilderMessage xml = new XmlMessage(message);
        BuilderMessage json = new JsonMessage(message);

        // Email Message
        objFabrica.construir(xml);
        //Message emailMessage = email.getMessage();

        // XML Message
        objFabrica.construir(xml);
        Message xmlMessage = xml.getMessage();

        // JSON Message
        objFabrica.construir(json);
        Message jsonMessage = json.getMessage();

    }


}
