package lab;


import lab.model.sendgrid.ClickEvent;
import lab.model.sendgrid.WebhookEventType;
import lab.process.Json2Pojo;
import lab.process.JsonSchemaToPojo;
import lab.process.PojoToJson;
import lab.process.PojoToJsonSchema;

import java.io.*;

public class MainTest {

    public static void main(String[] args) throws Exception {

        //Execute Pojo2JsonSchema
        File filePojo2JsonSchema = new File("src/main/resources/filePojo2JsonSchema_test.jsonschema.json");
        Writer writerPojo2JsonSchema = new FileWriter(filePojo2JsonSchema);
        PojoToJsonSchema.process(ClickEvent.class,writerPojo2JsonSchema);

        //Execute Pojo2Json
        ClickEvent click = new ClickEvent();
        click.setEmail("click@click.click");
        click.setUrl("http://click.com");
        click.setSendgridEventId("eventId");
        click.setSendgridMessageId("messageId");
        click.setEventType(WebhookEventType.Click); //No hauria de cladre aixo

        File filePojo2Json = new File("src/main/resources/Pojo2Json_test.json");
        Writer writerPojo2Json = new FileWriter(filePojo2Json);
        PojoToJson.process(click,writerPojo2Json);

        //Execute JsonSchemaToPojo
        JsonSchemaToPojo.process("plainEvent/SendgridEvent.jsonschema.json", "Pepe", "lab.model.generated.plain");

        //Execute Json2Pojo
        Reader json2PojoReader = new FileReader("src/main/resources/Pojo2Json_test.json");
        ClickEvent clickEvent = Json2Pojo.process(json2PojoReader, ClickEvent.class);
        System.out.println(clickEvent);

    }
}
