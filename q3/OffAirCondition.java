public class OffAirCondition implements ButtonAction{
    private Airconditioner airCon;

    public OffAirCondition(Airconditioner aircon){
        this.airCon = aircon;
    }

    @Override
    public String getRoomName(){
        return airCon.getRoomName(); 
    } 

    @Override
    public void execute(){
        airCon.off(); 
    } 

}