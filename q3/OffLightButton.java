public class OffLightButton implements ButtonAction{
    private Light light;

    public OffLightButton(Light light){
        this.light = light;
    }

    @Override
    public String getRoomName(){
        return light.getRoomName(); 
    } 

    @Override
    public void execute(){
        light.off();
    }

}
