package openCivV;

public class resource {
	private String provided;
	private int worth;
	public resource(String provides, int value){
		provided = provides;
		worth = value;
	}
	public int getValue(){
		return worth;
	}
	public String getProvides(){
		return provided;
	}
}
