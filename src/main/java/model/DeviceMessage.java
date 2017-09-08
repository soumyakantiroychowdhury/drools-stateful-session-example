package model;

public class DeviceMessage {
    private String deviceName;
    private int messageSequence;
    private int messageContent;

    public String getDeviceName()
    {
        return deviceName;
    }

    public void setDeviceName(String deviceName)
    {
        this.deviceName = deviceName;
    }

    public int getMessageSequence()
    {
        return messageSequence;
    }

    public void setMessageSequence(int sequence)
    {
        this.messageSequence = sequence;
    }

    public int getMessageContent()
    {
        return messageContent;
    }

    public void setMessageContent(int reading)
    {
        this.messageContent = reading;
    }
}
