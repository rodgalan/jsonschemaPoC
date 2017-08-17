package lab.model.sendgrid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonTypeName("Click")
public class ClickEvent extends EngagementEventBase
{

	@JsonProperty(required = true)
	private String url;
	public final String getUrl()
	{
		return url;
	}
	public final void setUrl(String value)
	{
		url = value;
	}

	@JsonProperty(value="url_offset")
	private UrlOffset urlOffset;
	public final UrlOffset getUrlOffset()
	{
		return urlOffset;
	}
	public final void setUrlOffset(UrlOffset value)
	{
		urlOffset = value;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}