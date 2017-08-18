package lab;


import lab.model.sendgrid.ClickEvent;
import lab.model.sendgrid.WebhookEventType;
import lab.process.JsonToPojo;
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
        PojoToJson.process(newPlainEvent(), "generated/plain/ClickEvent.json");
        PojoToJson.process(newHierachyEvent(), "generated/hierarchy/ClickEvent.json");

        // Execute JsonSchemaToPojo
        JsonSchemaToPojo.process("dummy/ClickEvent.jsonschema.json", "ClickEvent", "lab.model.generated.dummy");

        // Execute JsonToPojo
        ClickEvent clickEvent = JsonToPojo.process("dummy/ClickEvent.json", ClickEvent.class);
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

    private static lab.model.plain.SendgridEvent newPlainEvent(){
        lab.model.plain.SendgridEvent plainEvent = new lab.model.plain.SendgridEvent();
        plainEvent.setEmail("click@click.click");
        plainEvent.setUrl("http://click.com");
        plainEvent.setSendgridEventId("eventId");
        plainEvent.setSendgridMessageId("messageId");
        plainEvent.setEventType(lab.model.plain.WebhookEventType.Click);
        return plainEvent;
    }

    private static lab.model.hierarchy.SendgridEvent newHierachyEvent(){
        lab.model.hierarchy.SendgridEvent hierarchyEvent = new lab.model.hierarchy.SendgridEvent();

        lab.model.hierarchy.ClickEvent clickEvent = new lab.model.hierarchy.ClickEvent();
        clickEvent.setEmail("click@click.click");
        clickEvent.setUrl("http://click.com");
        clickEvent.setSendgridEventId("eventId");
        clickEvent.setSendgridMessageId("messageId");

        hierarchyEvent.setEvent(clickEvent);
        return hierarchyEvent;
    }
}
