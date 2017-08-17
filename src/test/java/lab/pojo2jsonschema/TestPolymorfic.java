package lab.pojo2jsonschema;


import com.fasterxml.jackson.databind.ObjectMapper;
import lab.pojo2jsonschema.model.sendgrid.ClickEvent;
import lab.pojo2jsonschema.model.sendgrid.WebhookEventType;
import lab.pojo2jsonschema.model.sendgrid.expanded.SendgridEvent;


import java.io.IOException;

public class TestPolymorfic {

  @Test
  public void test (String[] args) throws IOException {

    //TEST JAVA --> JSON
    SendgridEvent event = new SendgridEvent();
    ClickEvent click = new ClickEvent();
    click.setEmail("click@click.click");
    click.setUrl("http://click.com");
    click.setSendgridEventId("eventId");
    click.setSendgridMessageId("messageId");
    click.setEventType(WebhookEventType.Click); //No hauria de cladre aixo
    event.setEvent(click);

    ObjectMapper mapper = new ObjectMapper();
    String eventAsString = mapper.writeValueAsString(event);

    System.out.println(eventAsString);

    //TEST JSON --> JAVA

    SendgridEvent eventFromJackson = mapper.readValue(eventAsString,SendgridEvent.class);

    System.out.println(eventFromJackson);




  }
}
