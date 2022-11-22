package ngtHub;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Blankie{
	String color;
	String getColor() {
		return color;
	}
	boolean isPink() {
		return "pink".equals(color);
	}
}

public class NewStand {
	public static void main(String[] args) {
		Blankie bn = new Blankie();
		Blankie bnn = new Blankie();
		bn.color = "pink";
		bnn.color = "pink";
		//List<Blankie> list = Arrays.asList(bn,bnn);
		Stream.of(bn,bnn).filter(Blankie::isPink).forEach(s-> System.out.println(s.isPink()));
		//list.stream().filter(s -> s.getColor()=="pink").forEach(s-> System.out.println(s.color));
	}
}
