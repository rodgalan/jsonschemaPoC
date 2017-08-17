package lab.pojo2jsonschema.model.sendgrid;

public class ProcessedEvent extends DeliveryEventBase
{
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty("send_at"), JsonConverter(typeof(EpochToDateTimeConverter))] public DateTime SendAt {get;set;}
	private java.time.LocalDateTime SendAt = java.time.LocalDateTime.MIN;
	public final java.time.LocalDateTime getSendAt()
	{
		return SendAt;
	}
	public final void setSendAt(java.time.LocalDateTime value)
	{
		SendAt = value;
	}
}