public class FanFootball implements Observer {
    @Override
    public void update(Source o) {
        System.out.println(	 "live result: " + ((LiveScoreManager)o).getScore());
    }
}
