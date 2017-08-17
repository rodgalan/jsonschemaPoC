package lab.pojo2jsonschema.model.sendgrid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

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
}