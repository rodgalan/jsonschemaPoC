package lab.model.hierarchy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lab.serializers.NumericBooleanDeserializer;
import lab.serializers.NumericBooleanSerializer;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonTypeName("Open")
public class OpenEvent extends WebhookEventBase
{
    @Override
    public WebhookEventType getEventType() {
        return WebhookEventType.Open;
    }

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
