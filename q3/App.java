public class App {
    public static void main(String[]args){
        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");
        Airconditioner bedroomAirCondition = new Airconditioner("Bedroom");

        OnLightButton onLightInBedroom = new OnLightButton(bedroomLight);
        OffLightButton offLightInBedroom = new OffLightButton(bedroomLight);

        OnLightButton onLightInKitchen = new OnLightButton(kitchenLight);
        OffLightButton offLightInKitchen = new OffLightButton(kitchenLight);

        OnAirCondition onAirCondition = new OnAirCondition(bedroomAirCondition, 25);
        OffAirCondition offAirCondition = new OffAirCondition(bedroomAirCondition);

        RemoteControl remote = new RemoteControl();

        remote.addActionButtonToSlot(onLightInBedroom, offLightInBedroom, 0);
        remote.addActionButtonToSlot(onLightInKitchen, offLightInKitchen, 1);
        remote.addActionButtonToSlot(onAirCondition, offAirCondition, 2);

        remote.hitButton(0);
        remote.hitButton(1);
        remote.hitButton(2);
        remote.hitButton(3);
        remote.hitButton(4);
        remote.hitButton(5);
        remote.hitButton(6);
    } 
}
