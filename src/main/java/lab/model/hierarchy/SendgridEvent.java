package lab.model.hierarchy;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

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
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
