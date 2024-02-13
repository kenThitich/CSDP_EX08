public class RemoteControl {
    private ButtonAction[][] buttonSlot = new ButtonAction[6][2];

    public void addActionButtonToSlot(ButtonAction left, ButtonAction right,int ind){
        buttonSlot[ind][0] = left;
        buttonSlot[ind][1] = right;
    }

    public void removeActionButtonInSlot(int ind){
        buttonSlot[ind][0] = null;
        buttonSlot[ind][1] = null;
    }

    public void hitButton(int ind){
        if(buttonSlot[ind][0] != null){
            System.out.println("slot "+ind+", "+buttonSlot[ind][0].getRoomName());
            buttonSlot[ind][0].execute();
            buttonSlot[ind][1].execute();
            System.out.println("--------------------------------------------------------");
        }
        else {
            System.out.println("test one unavailable slot, slot "+ind);
            System.out.println("On button No command is assigned to this slot");
            System.out.println("Off button No command is assigned to this slot");
            System.out.println("--------------------------------------------------------");
        }
        
    }
}
