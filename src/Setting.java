
/**
 * Setting enum class. 
 *  
 * @author Miles Walcott
 * @author Ryker Phelps
 * 
 * Purpose: Simulates the settings of a burner
 */

public enum Setting {
	OFF ("---"), LOW ("--+"), MEDIUM ("-++"), HIGH ("+++");
	private String value;

	Setting(String setting) {
		value = setting;
	}

	public String toString() {
		return value;
	}
}
