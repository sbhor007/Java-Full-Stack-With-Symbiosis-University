package footballplayer;

public class FootballPlayer {
	private String playerName;
	Football football;
	public FootballPlayer(String playerName, Football football) {
		super();
		this.playerName = playerName;
		this.football = football;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Football getFootball() {
		return football;
	}
	public void setFootball(Football football) {
		this.football = football;
	}
	
	
}
