package lab.pojo2jsonschema.model.sendgrid;

public class DroppedEvent extends DeliveryEventBase
{
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty("reason")] public string Reason {get;set;}
	private String Reason;
	public final String getReason()
	{
		return Reason;
	}
	public final void setReason(String value)
	{
		Reason = value;
	}
}