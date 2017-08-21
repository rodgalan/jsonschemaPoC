
package lab.model.generated.composite;

import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SendgridEvent
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "click_event",
    "open_event"
})
public class SendgridEvent {

    @JsonProperty("click_event")
    @Valid
    private ClickEvent clickEvent;
    @JsonProperty("open_event")
    @Valid
    private OpenEvent openEvent;

    @JsonProperty("click_event")
    public ClickEvent getClickEvent() {
        return clickEvent;
    }

    @JsonProperty("click_event")
    public void setClickEvent(ClickEvent clickEvent) {
        this.clickEvent = clickEvent;
    }

    @JsonProperty("open_event")
    public OpenEvent getOpenEvent() {
        return openEvent;
    }

    @JsonProperty("open_event")
    public void setOpenEvent(OpenEvent openEvent) {
        this.openEvent = openEvent;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clickEvent).append(openEvent).toHashCode();
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
        return new EqualsBuilder().append(clickEvent, rhs.clickEvent).append(openEvent, rhs.openEvent).isEquals();
    }

}
