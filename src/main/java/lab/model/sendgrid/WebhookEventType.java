package lab.model.sendgrid;

public enum WebhookEventType
{
	/** 
	 Message has been received and is ready to be delivered.
	*/
	Processed,
	/** 
	 You may see the following drop reasons: Invalid SMTPAPI header, Spam Content (if spam checker app enabled), Unsubscribed Address, Bounced Address, Spam Reporting Address, Invalid, Recipient List over Package Quota
	*/
	Dropped,
	/** 
	 Message has been successfully delivered to the receiving server.
	*/
	Delivered,
	/** 
	 Recipient’s email server temporarily rejected message.
	*/
	Deferred,
	/** 
	 Receiving server could not or would not accept message.
	*/
	Bounce,
	/** 
	 Recipient has opened the HTML message.
	*/
	Open,
	/** 
	 Recipient clicked on a link within the message.
	*/
	Click,
	/** 
	 Recipient marked message as spam.
	*/
	SpamReport,
	/** 
	 Recipient clicked on message’s subscription management link.
	*/
	Unsubscribe,
	/** 
	 Recipient unsubscribed from specific group, by either direct link or updating preferences.
	*/
	Group_Unsubscribe,
	Group_Resubscribe;

	public static final int SIZE = Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static WebhookEventType forValue(int value)
	{
		return values()[value];
	}
}