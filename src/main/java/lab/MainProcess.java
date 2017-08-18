package lab;


import lab.model.sendgrid.ClickEvent;
import lab.model.sendgrid.WebhookEventType;
import lab.process.Json2Pojo;
import lab.process.JsonSchemaToPojo;
import lab.process.PojoToJson;
import lab.process.PojoToJsonSchema;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class MainProcess {

    public static void main(String[] args) throws Exception {

        // Execute PojoToJsonSchema
        PojoToJsonSchema.process(ClickEvent.class, "dummy/ClickEvent.jsonschema.json");

        // Execute PojoToJson
        PojoToJson.process(newClickEvent(), "generated/dummy/ClickEvent.json");

        //Execute JsonSchemaToPojo
        JsonSchemaToPojo.process("dummy/ClickEvent.jsonschema.json", "ClickEvent", "lab.model.generated.dummy");

        // Execute Json2Pojo
        ClickEvent clickEvent = Json2Pojo.process("dummy/ClickEvent.json", ClickEvent.class);
        System.out.println(ToStringBuilder.reflectionToString(clickEvent, ToStringStyle.MULTI_LINE_STYLE));
    }

    private static ClickEvent newClickEvent() {
        ClickEvent click = new ClickEvent();
        click.setEmail("click@click.click");
        click.setUrl("http://click.com");
        click.setSendgridEventId("eventId");
        click.setSendgridMessageId("messageId");
        click.setEventType(WebhookEventType.Click);
        return click;
    }
}
