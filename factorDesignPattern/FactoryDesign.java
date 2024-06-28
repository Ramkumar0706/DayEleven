package factorDesignPattern;

public class FactoryDesign {
	
	public void getPen(Pen pen) {
		if(pen instanceof InkPen) {
			pen.pen();
		}
		if(pen instanceof SketchPen) {
			pen.pen();
		}
		if(pen instanceof MarkerPen) {
			pen.pen();
		}
	}

}
