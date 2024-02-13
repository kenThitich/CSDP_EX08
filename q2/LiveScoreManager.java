public class LiveScoreManager extends Source {
   
    private String score;

    public void setScore(String score) {
        this.score = score;
        notifyObservers();
    }
    public String getScore() {
	    return this.score ;
    }
    
}
