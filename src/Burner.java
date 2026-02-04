
/**
 * Burner class. 
 *  
 * @author Miles Walcott
 * @author Ryker Phelps
 * 
 * Purpose: Simulates a burner with varied settings and temperatures that update in time based on settings
 */

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

	// increase the setting on the burner
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
		case Setting.HIGH:
			mySetting = Setting.HIGH;
			break;
		}
	}

	// decrease the setting on the burner
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
		case Setting.OFF:
			mySetting = Setting.OFF;
			break;
		}
	}

	public void updateTemperature() {
		timer--;
		// If enough time has passed, change the temperature to correspond to the setting
		if(timer == 0) {
			switch (mySetting) {
			case Setting.OFF:
				myTemperature = Temperature.COLD;
				break;
			case Setting.LOW:
				myTemperature = Temperature.WARM;
				break;
			case Setting.MEDIUM:
				myTemperature = Temperature.HOT;
				break;
			case Setting.HIGH:
				myTemperature = Temperature.BLAZING;
				break;
			}
		}
	}
	
	public void display() {
		System.out.println("[" + mySetting + "]" + "....." + myTemperature);
	}

}
