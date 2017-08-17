package lab.pojo2jsonschema.model.sendgrid;

//import Newtonsoft.Json.*;

public class BounceEvent extends DeliveryEventBase
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

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty("type")] public string BounceType {get;set;}
	private String BounceType;
	public final String getBounceType()
	{
		return BounceType;
	}
	public final void setBounceType(String value)
	{
		BounceType = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty("status")] public string BounceStatus {get;set;}
	private String BounceStatus;
	public final String getBounceStatus()
	{
		return BounceStatus;
	}
	public final void setBounceStatus(String value)
	{
		BounceStatus = value;
	}
}