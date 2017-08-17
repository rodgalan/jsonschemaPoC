package lab;


import lab.model.sendgrid.ClickEvent;
import lab.model.sendgrid.WebhookEventType;
import lab.process.JsonSchemaToPojo;
import lab.process.PojoToJson;
import lab.process.PojoToJsonSchema;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class MainTest {

    public static void main(String[] args) throws Exception {

        //Execute Pojo2JsonSchema
        File filePojo2JosnSchema = new File("src/main/resources/filePojo2JosnSchema_test.jsonschema.json");
        Writer writerPojo2JosnSchema = new FileWriter(filePojo2JosnSchema);
        PojoToJsonSchema.process(ClickEvent.class,writerPojo2JosnSchema);

        //Execute Pojo2Json
        ClickEvent click = new ClickEvent();
        click.setEmail("click@click.click");
        click.setUrl("http://click.com");
        click.setSendgridEventId("eventId");
        click.setSendgridMessageId("messageId");
        click.setEventType(WebhookEventType.Click); //No hauria de cladre aixo

        File filePojo2Json = new File("src/main/resources/Pojo2Json_test.json");
        Writer wtiterPojo2Json = new FileWriter(filePojo2Json);
        PojoToJson.process(click,wtiterPojo2Json);


        //Execute JsonSchemaToPojo
        JsonSchemaToPojo.process("plainEvent/SendgridEvent.jsonschema.json", "Pepe", "lab.model.generated.plain");
    }
}
