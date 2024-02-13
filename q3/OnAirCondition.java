public class OnAirCondition implements ButtonAction{
    private Airconditioner airCon;
    private int temp;

    public OnAirCondition(Airconditioner aircon, int temp){
        this.airCon = aircon;
        this.temp = temp;
    }

    @Override
    public String getRoomName(){
        return airCon.getRoomName(); 
    } 

    @Override
    public void execute(){
        airCon.on(); 
        airCon.setTemp(this.temp); 
    } 

}