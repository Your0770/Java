package chap08;

public interface RemoteControl {
	//상수
	public int MAX_VOLUEME = 10;
	public int MIN_VOLUEME = 0;
	
	//추상메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}
