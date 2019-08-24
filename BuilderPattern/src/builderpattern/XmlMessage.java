/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 *
 * @author Ingenieria
 */
public class XmlMessage extends BuilderMessage {

    public XmlMessage(Message message) {
    }

    @Override
    public void prepareMessage() {

    }

    @Override
    public void createMessage() {
        
    }

    @Override
    public void sendMessage() {
        try {
            String xmlData = "<?xml version=\"1.0\"?><!-- Information of Message --><books><book id=\"1\"><name>Let Us C</name><author>Yashwant Kanetkar</author><price>245.00</price></book><book id=\"2\"><name>Let Us C++</name><author>Yashwant Kanetkar</author><price>252.00</price></book><book id=\"3\"><name>Java The Complete Reference</name><author>Herbert Schildt</author><price>489.00</price></book><book id=\"4\"><name>HTML5 Black Book</name><author>Kogent Learning Solutions</author><price>485.00</price></book></books>";

            String str = XMLUtil.getPrettyString(xmlData, 2);

            System.out.println(str);
        } catch (Exception e) {

        }

    }

}
