public class Melon {

	public static void main(String[] args) {
		System.out.println("melon defined");
	}

    final MelonType melonType;
    final int shapeRating;
    final int colorRating;
    final int field;
    final String harvester;

	public Melon (MelonType melonType, int shapeRating, int colorRating, int field, String harvester) {
		this.melonType = melonType;
		this.shapeRating = shapeRating;
		this.colorRating = colorRating;
		this.field = field;
		this.harvester = harvester;
	}

	public boolean isSellable() {
		return this.colorRating > 5 && this.shapeRating > 5 && this.field != 3;
	}

}

