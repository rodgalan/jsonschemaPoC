
package lab.model.generated.plain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "email",
    "category",
    "timestamp",
    "ip",
    "tls",
    "url",
    "sg_message_id",
    "sg_event_id",
    "event",
    "useragent",
    "cert_err",
    "url_offset"
})
public class SendgridEvent {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("email")
    @NotNull
    private String email;
    @JsonProperty("category")
    @Valid
    private List<String> category = new ArrayList<String>();
    @JsonProperty("timestamp")
    private Integer timestamp;
    @JsonProperty("ip")
    private String ip;
    @JsonProperty("tls")
    private Object tls;
    @JsonProperty("url")
    private String url;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sg_message_id")
    @NotNull
    private String sgMessageId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sg_event_id")
    @NotNull
    private String sgEventId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("event")
    @NotNull
    private SendgridEvent.Event event;
    @JsonProperty("useragent")
    private String useragent;
    @JsonProperty("cert_err")
    private Object certErr;
    @JsonProperty("url_offset")
    @Valid
    private UrlOffset urlOffset;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("category")
    public List<String> getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(List<String> category) {
        this.category = category;
    }

    @JsonProperty("timestamp")
    public Integer getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    @JsonProperty("tls")
    public Object getTls() {
        return tls;
    }

    @JsonProperty("tls")
    public void setTls(Object tls) {
        this.tls = tls;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sg_message_id")
    public String getSgMessageId() {
        return sgMessageId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sg_message_id")
    public void setSgMessageId(String sgMessageId) {
        this.sgMessageId = sgMessageId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sg_event_id")
    public String getSgEventId() {
        return sgEventId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sg_event_id")
    public void setSgEventId(String sgEventId) {
        this.sgEventId = sgEventId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("event")
    public SendgridEvent.Event getEvent() {
        return event;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("event")
    public void setEvent(SendgridEvent.Event event) {
        this.event = event;
    }

    @JsonProperty("useragent")
    public String getUseragent() {
        return useragent;
    }

    @JsonProperty("useragent")
    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }

    @JsonProperty("cert_err")
    public Object getCertErr() {
        return certErr;
    }

    @JsonProperty("cert_err")
    public void setCertErr(Object certErr) {
        this.certErr = certErr;
    }

    @JsonProperty("url_offset")
    public UrlOffset getUrlOffset() {
        return urlOffset;
    }

    @JsonProperty("url_offset")
    public void setUrlOffset(UrlOffset urlOffset) {
        this.urlOffset = urlOffset;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(email).append(category).append(timestamp).append(ip).append(tls).append(url).append(sgMessageId).append(sgEventId).append(event).append(useragent).append(certErr).append(urlOffset).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SendgridEvent) == false) {
            return false;
        }
        SendgridEvent rhs = ((SendgridEvent) other);
        return new EqualsBuilder().append(email, rhs.email).append(category, rhs.category).append(timestamp, rhs.timestamp).append(ip, rhs.ip).append(tls, rhs.tls).append(url, rhs.url).append(sgMessageId, rhs.sgMessageId).append(sgEventId, rhs.sgEventId).append(event, rhs.event).append(useragent, rhs.useragent).append(certErr, rhs.certErr).append(urlOffset, rhs.urlOffset).isEquals();
    }

    public enum Event {

        PROCESSED("Processed"),
        DROPPED("Dropped"),
        DELIVERED("Delivered"),
        DEFERRED("Deferred"),
        BOUNCE("Bounce"),
        OPEN("Open"),
        CLICK("Click"),
        SPAM_REPORT("SpamReport"),
        UNSUBSCRIBE("Unsubscribe"),
        GROUP_UNSUBSCRIBE("Group_Unsubscribe"),
        GROUP_RESUBSCRIBE("Group_Resubscribe");
        private final String value;
        private final static Map<String, SendgridEvent.Event> CONSTANTS = new HashMap<String, SendgridEvent.Event>();

        static {
            for (SendgridEvent.Event c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Event(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static SendgridEvent.Event fromValue(String value) {
            SendgridEvent.Event constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
