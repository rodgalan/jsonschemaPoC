package lab.model.hierarchy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lab.serializers.NumericBooleanDeserializer;
import lab.serializers.NumericBooleanSerializer;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;
import java.util.Map;


@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME,
		include = JsonTypeInfo.As.PROPERTY,
		property = "event",
		visible = true
)
@JsonSubTypes({
		@JsonSubTypes.Type(value = ClickEvent.class, name = "Click"),
		@JsonSubTypes.Type(value = OpenEvent.class, name = "Open"),
		@JsonSubTypes.Type(value = DeliveryEvent.class, name = "Delivered"),
})

public abstract class WebhookEventBase
{

	public abstract WebhookEventType getEventType();

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

	//COMMON IN EGAGEMENT AND DELIVERY EVENTS
	private String ip;

	@JsonSerialize(using=NumericBooleanSerializer.class)
	@JsonDeserialize(using=NumericBooleanDeserializer.class)
	private boolean tls;

	@JsonSerialize(using=NumericBooleanSerializer.class)
	@JsonDeserialize(using=NumericBooleanDeserializer.class)
	@JsonProperty(value = "cert_err")
	private boolean certificateError;

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
		return ToStringBuilder.reflectionToString(this);
	}
}