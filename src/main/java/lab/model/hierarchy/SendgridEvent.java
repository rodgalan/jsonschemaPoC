package lab.model.hierarchy;



public class SendgridEvent {

    private WebhookEventBase event;

    public WebhookEventBase getEvent() {
        return event;
    }

    public void setEvent(WebhookEventBase event) {
        this.event = event;
    }
}
