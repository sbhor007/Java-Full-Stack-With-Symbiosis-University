package footballplayer;

public class Football {
	private String type;
	private int size;
	private int waight;
	public Football(String type, int size, int waight) {
		this.type = type;
		this.size = size;
		this.waight = waight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getWaight() {
		return waight;
	}
	public void setWaight(int waight) {
		this.waight = waight;
	}
}
