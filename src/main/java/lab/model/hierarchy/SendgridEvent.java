package lab.model.hierarchy;


import org.apache.commons.lang3.builder.ToStringBuilder;

public class SendgridEvent {

    private WebhookEventBase event;

    public WebhookEventBase getEvent() {
        return event;
    }

    public void setEvent(WebhookEventBase event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
