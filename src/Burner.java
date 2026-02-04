
public class Burner {
	public Burner() {
		myTemperature = Temperature.COLD;
		mySetting = Setting.OFF;
	}
	
	public enum Temperature {
		BLAZING (3), HOT (2), WARM (1), COLD (0);
		int value;
		
		Temperature(int setting) {
			value = setting;
		}
		
		public String toString() {
			return value + "";
		}
	}

	public enum Setting {
		OFF (0), LOW (1), MEDIUM (2), HIGH (3);
		private int value;

		Setting(int setting) {
			value = setting;
		}

		public String toString() {
			if(this.value == 0) {
				return "---";
			}
			else if(this.value == 1) {
				return "--+";
			}
			else if(this.value == 2) {
				return "-++";
			}
			else if(this.value == 3) {
				return "+++";
			}
			else {
				return "Hi :)";
			}
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
		if(mySetting != Setting.HIGH) {
			mySetting.value++;
		}
	}
	
	public void minusButton() {
		if(mySetting != Setting.OFF) {
			mySetting.value--;
		}
	}
	
}
