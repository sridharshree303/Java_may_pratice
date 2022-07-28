package pluralsite.collections;

public class MyClass {
	String label, value;

	public String getLabel() {
		return label;
	}

	public String getValue() {
		return value;
	}

	public MyClass(String label, String value) {
		super();
		this.label = label;
		this.value = value;
	}

	public boolean equals(Object o) {
		MyClass other = (MyClass) o;
		return value.equalsIgnoreCase(other.value);
	}
	
	public int compareTo(MyClass other) {
		return value.compareToIgnoreCase(other.value);
	}
	

	@Override
	public String toString() {
		return "[label=" + label + ", value=" + value + "]";
	}
	
}
