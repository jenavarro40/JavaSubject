
public class Triangle {

	static private int Height;
	static private int Area;

	public Triangle() {
		this(5);

	}

	public Triangle(int Height) {
		setHeight(Height);

	}

	/**
	 * @return the height
	 */
	public static int getHeight() {
		return Height;
	}

	/**
	 * @param height the height to set
	 */
	public static void setHeight(int height) {
		Height = height;
		Area = 0;
		for (int i = -1; i < Height; i++) {
			for (int j = -1; j < i; j++) {

				Area = Area + 1;
			}
		}
	}

	/**
	 * @return the area
	 */
	public static int getArea() {
		return Area;
	}

	/**
	 * @param area the area to set
	 */
	public static void setArea(int area) {
		Area = area;
	}

	public static void print() {

		for (int i = -1; i < Height; i++) {
			for (int j = -1; j < i; j++) {
				System.out.print("#");

			}
			System.out.println();
		}

	}
}
