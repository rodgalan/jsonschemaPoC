package lab.pojo2jsonschema.model.sendgrid.expanded;


import lab.pojo2jsonschema.model.sendgrid.WebhookEventBase;

public class SendgridEvent {

    private WebhookEventBase event;

    public WebhookEventBase getEvent() {
        return event;
    }

    public void setEvent(WebhookEventBase event) {
        this.event = event;
    }
}
