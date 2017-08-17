package lab.model.sendgrid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lab.serializers.NumericBooleanDeserializer;
import lab.serializers.NumericBooleanSerializer;

public abstract class DeliveryEventBase extends WebhookEventBase
{

@JsonProperty(value = "smtp-id")
	private String smtpId;
	public final String getSmtpId()
	{
		return smtpId;
	}
	public final void setSmtpId(String value)
	{
		smtpId = value;
	}

	private String ip;
	public final String getIp()
	{
		return ip;
	}
	public final void setIp(String value)
	{
		ip = value;
	}


	@JsonSerialize(using=NumericBooleanSerializer.class)
	@JsonDeserialize(using=NumericBooleanDeserializer.class)
	private boolean tls;
	public final boolean getTls()
	{
		return tls;
	}
	public final void setTls(boolean value)
	{
		tls = value;
	}

	@JsonSerialize(using=NumericBooleanSerializer.class)
	@JsonDeserialize(using=NumericBooleanDeserializer.class)
	@JsonProperty(value = "cert_err")
	private boolean certificateError;
	public final boolean getCertificateError()
	{
		return certificateError;
	}
	public final void setCertificateError(boolean value)
	{
		certificateError = value;
	}
}