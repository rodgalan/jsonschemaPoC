package lab.pojo2jsonschema.model.sendgrid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.HashMap;
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
	public WebhookEventBase()
	{
		setUniqueParameters(new HashMap<String, String>());
	}

	@JsonProperty(value="sg_message_id", required = true)
	private String sendgridMessageId;
	public final String getSendgridMessageId()
	{
		return sendgridMessageId;
	}
	public final void setSendgridMessageId(String value)
	{
		sendgridMessageId = value;
	}

	@JsonProperty(value="sg_event_id", required = true)
	private String sendgridEventId;
	public final String getSendgridEventId()
	{
		return sendgridEventId;
	}
	public final void setSendgridEventId(String value)
	{
		sendgridEventId = value;
	}

	@JsonProperty(value="event", required = true)
	private WebhookEventType eventType = WebhookEventType.values()[0];
	public final WebhookEventType getEventType()
	{
		return eventType;
	}
	public final void setEventType(WebhookEventType value)
	{
		eventType = value;
	}

	@JsonProperty(required = true)
	private String email;
	public final String getEmail()
	{
		return email;
	}
	public final void setEmail(String value)
	{
		email = value;
	}

	private List<String> category;
	public final List<String> getCategory()
	{
		return category;
	}
	public final void setCategory(List<String> value)
	{
		category = value;
	}

	//TODO: Format date to Activity Steram 2.0 format
	private long timestamp;

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	private Map<String, String> uniqueParameters;
	public final Map<String, String> getUniqueParameters()
	{
		return uniqueParameters;
	}
	public final void setUniqueParameters(Map<String, String> value)
	{
		uniqueParameters = value;
	}
}