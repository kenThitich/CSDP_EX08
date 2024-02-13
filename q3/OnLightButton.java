public class OnLightButton implements ButtonAction{
    private Light light;

    public OnLightButton(Light light){
        this.light = light;
    }

    @Override
    public String getRoomName(){
        return light.getRoomName(); 
    } 

    @Override
    public void execute(){
        light.on();
    }

}
