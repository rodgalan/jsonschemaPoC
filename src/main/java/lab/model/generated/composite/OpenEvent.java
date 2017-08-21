
package lab.model.generated.composite;

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
    "base_event"
})
public class OpenEvent {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base_event")
    @Valid
    @NotNull
    private BaseEvent baseEvent;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base_event")
    public BaseEvent getBaseEvent() {
        return baseEvent;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base_event")
    public void setBaseEvent(BaseEvent baseEvent) {
        this.baseEvent = baseEvent;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(baseEvent).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpenEvent) == false) {
            return false;
        }
        OpenEvent rhs = ((OpenEvent) other);
        return new EqualsBuilder().append(baseEvent, rhs.baseEvent).isEquals();
    }

}
