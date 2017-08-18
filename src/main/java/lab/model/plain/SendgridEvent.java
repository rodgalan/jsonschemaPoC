package lab.model.plain;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lab.model.sendgrid.UrlOffset;
import lab.serializers.NumericBooleanDeserializer;
import lab.serializers.NumericBooleanSerializer;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;
import java.util.Map;

public class SendgridEvent {

    //FROM BASE EVENT

    @JsonProperty(value="sg_message_id", required = true)
    private String sendgridMessageId;

    @JsonProperty(value="sg_event_id", required = true)
    private String sendgridEventId;

    @JsonProperty(value="event", required = true)
    private WebhookEventType eventType = WebhookEventType.values()[0];

    @JsonProperty(required = true)
    private String email;

    private List<String> category;

    //TODO: Format date to Activity Steram 2.0 format
    private long timestamp;

    //FROM ENGAGEMENT EVENT
    @JsonProperty(value="useragent")
    private String userAgent;

    private String ip;

    @JsonSerialize(using=NumericBooleanSerializer.class)
    @JsonDeserialize(using=NumericBooleanDeserializer.class)
    private boolean tls;

    @JsonSerialize(using=NumericBooleanSerializer.class)
    @JsonDeserialize(using=NumericBooleanDeserializer.class)
    @JsonProperty(value="cert_err")
    private boolean certificateError;

    //FROM CLICK EVENT
    @JsonProperty(required = true)
    private String url;

    @JsonProperty(value="url_offset")
    private UrlOffset urlOffset;

    public String getSendgridMessageId() {
        return sendgridMessageId;
    }

    public void setSendgridMessageId(String sendgridMessageId) {
        this.sendgridMessageId = sendgridMessageId;
    }

    public String getSendgridEventId() {
        return sendgridEventId;
    }

    public void setSendgridEventId(String sendgridEventId) {
        this.sendgridEventId = sendgridEventId;
    }

    public WebhookEventType getEventType() {
        return eventType;
    }

    public void setEventType(WebhookEventType eventType) {
        this.eventType = eventType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public boolean isTls() {
        return tls;
    }

    public void setTls(boolean tls) {
        this.tls = tls;
    }

    public boolean isCertificateError() {
        return certificateError;
    }

    public void setCertificateError(boolean certificateError) {
        this.certificateError = certificateError;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UrlOffset getUrlOffset() {
        return urlOffset;
    }

    public void setUrlOffset(UrlOffset urlOffset) {
        this.urlOffset = urlOffset;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
