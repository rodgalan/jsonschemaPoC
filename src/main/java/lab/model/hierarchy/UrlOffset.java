package lab.model.hierarchy;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class UrlOffset
{

	private int index;
	public final int getIndex()
	{
		return index;
	}
	public final void setIndex(int value)
	{
		index = value;
	}


	private String type;
	public final String getType()
	{
		return type;
	}
	public final void setType(String value)
	{
		type = value;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}