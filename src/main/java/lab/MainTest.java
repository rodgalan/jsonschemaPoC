package lab;


import lab.model.sendgrid.ClickEvent;
import lab.model.sendgrid.WebhookEventType;
import lab.process.PojoToJson;
import lab.process.PojoToJsonSchema;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MainTest {

    public static void main(String[] args) throws IOException {

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







    }
}
