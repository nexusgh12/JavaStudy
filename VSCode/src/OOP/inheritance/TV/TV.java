package OOP.inheritance.TV;

public class TV {
    private boolean power;
    private int channel;

    TV(){
        power = false;
        channel = 0;
    }
    public void channelUp(){
        if(this.channel >= 0)
        {
            this.channel += 1;
            System.out.println("채널을 올렸습니다 현재 채널: " + this.channel);
        }
            
    }
    public void channelDown(){
        if(this.channel > 0)
        {
            this.channel -= 1;
            System.out.println("채널을 내렸습니다 현재 채널: " + this.channel);
        }
    }
}
