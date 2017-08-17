package lab.pojo2jsonschema.model.sendgrid;

public class DeferredEvent extends DeliveryEventBase
{
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty("response")] public string Response {get;set;}
	private String Response;
	public final String getResponse()
	{
		return Response;
	}
	public final void setResponse(String value)
	{
		Response = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty("attempt")] public string Attempts {get;set;}
	private String Attempts;
	public final String getAttempts()
	{
		return Attempts;
	}
	public final void setAttempts(String value)
	{
		Attempts = value;
	}
}