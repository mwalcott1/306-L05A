
public class Burner {
	public Burner() {
		myTemperature = Temperature.COLD;
		mySetting = Setting.OFF;
	}
	
	public enum Temperature {
		BLAZING ("VERY HOT! DON'T TOUCH"), HOT ("CAREFUL"), WARM ("warm"), COLD ("cooool");
		private String value;
		
		Temperature(String setting) {
			value = setting;
		}
		
		public String toString() {
			return value;
		}
	}
	
	private Temperature myTemperature;
	public Temperature getMyTemperature() {
		return myTemperature;
	}
	
	private Setting mySetting;
	public Setting getMySetting() {
		return mySetting;
	}
	
	private int timer;
	public final static int TIME_DURATION = 2;
	
	public void plusButton() {
		timer = TIME_DURATION;
		switch (mySetting) {
			case Setting.OFF:
				mySetting = Setting.LOW;
				break;
			case Setting.LOW:
				mySetting = Setting.MEDIUM;
				break;
			case Setting.MEDIUM:
				mySetting = Setting.HIGH;
				break;
		}
	}
	
	public void minusButton() {
		timer = TIME_DURATION;
		switch (mySetting) {
			case Setting.LOW:
				mySetting = Setting.OFF;
				break;
			case Setting.MEDIUM:
				mySetting = Setting.LOW;
				break;
			case Setting.HIGH:
				mySetting = Setting.MEDIUM;
				break;
		}
	}
	
	public void updateTemperature() {
		
	}
	
	public void display() {
		System.out.println("[" + mySetting + "]" + "....." + myTemperature);
	}
	
}
