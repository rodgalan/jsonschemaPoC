package lab.pojo2jsonschema.model.sendgrid;

public class GroupUnsubscribeEvent extends EngagementEventBase
{
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [JsonProperty("asm_group_id")] public int GroupId {get;set;}
	private int GroupId;
	public final int getGroupId()
	{
		return GroupId;
	}
	public final void setGroupId(int value)
	{
		GroupId = value;
	}
}