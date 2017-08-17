package lab;


import lab.model.sendgrid.ClickEvent;
import lab.model.sendgrid.WebhookEventType;
import lab.model.sendgrid.expanded.SendgridEvent;
import lab.process.PojoToJsonSchema;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MainTest {

    public static void main(String[] args) throws IOException {

        //Execute Pojo2JsonSchema
        ClickEvent click = new ClickEvent();
        click.setEmail("click@click.click");
        click.setUrl("http://click.com");
        click.setSendgridEventId("eventId");
        click.setSendgridMessageId("messageId");
        click.setEventType(WebhookEventType.Click); //No hauria de cladre aixo
        File file = new File("src/main/resources/test.jsonschema.json");
        Writer fileWriter = new FileWriter(file);
        PojoToJsonSchema.process(click,fileWriter);
    }
}
