
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
