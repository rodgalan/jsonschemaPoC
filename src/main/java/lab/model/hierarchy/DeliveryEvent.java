package lab.model.hierarchy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonTypeName("Delivered")
public class DeliveryEvent extends WebhookEventBase
{
    @Override
    public WebhookEventType getEventType() {
        return WebhookEventType.Delivered;
    }

    //FROM DELIVERY EVENT BASE
    @JsonProperty(value = "smtp-id")
    private String smtpId;

    public String getSmtpId() {
        return smtpId;
    }

    public void setSmtpId(String smtpId) {
        this.smtpId = smtpId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}