
package lab.model.generated.hierarchy;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "useragent",
    "url_offset"
})
public class SendgridEvent {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    @NotNull
    private String url;
    @JsonProperty("useragent")
    private String useragent;
    @JsonProperty("url_offset")
    @Valid
    private UrlOffset urlOffset;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("useragent")
    public String getUseragent() {
        return useragent;
    }

    @JsonProperty("useragent")
    public void setUseragent(String useragent) {
        this.useragent = useragent;
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
        return new HashCodeBuilder().append(url).append(useragent).append(urlOffset).toHashCode();
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
        return new EqualsBuilder().append(url, rhs.url).append(useragent, rhs.useragent).append(urlOffset, rhs.urlOffset).isEquals();
    }

}
