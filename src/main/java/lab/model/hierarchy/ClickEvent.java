package lab.model.hierarchy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonTypeName("Click")
public class ClickEvent extends WebhookEventBase
{
	@Override
	public lab.model.hierarchy.WebhookEventType getEventType() {
		return lab.model.hierarchy.WebhookEventType.Click;
	}

	//FROM ENGAGEMENT EVENT
	@JsonProperty(value="useragent")
	private String userAgent;

	//FROM CLICK EVENT
	@JsonProperty(required = true)
	private String url;

	@JsonProperty(value="url_offset")
	private UrlOffset urlOffset;

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
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
		return ToStringBuilder.reflectionToString(this);
	}
}