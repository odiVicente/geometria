
/**
 * @author Vicente Antón
 * @version 1.2
 */
public class Rectangulo_VAS extends FiguraGeometrica_VAS {
	private double l1;
	private double l2;
	
	/**
	 * Es el metodo constructor de Rectangulo_VAS crea un objeto Figura llamando
	 * a figura geometrica y le asigna valores al alto y al largo del rectangulo
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_VAS(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	/**
	 * Sobreescribe el metodo area de la clase abstracta para que cuando
	 * se llame al metodo area sea este el que se aplique al objeto Rectangulo
	 * en este caso retorna el producto de los lados de la geometria.
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * Sobreescribe el metodo perimetro de la calse abstracta FiguraGeometrica
	 * para que cuando se llame al metodo perimetro sea este el que se aplique
	 * al objeto Rectangulo en este caso retorna la suma del doble de los lados
	 * de la geometria.
	 */
	
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
