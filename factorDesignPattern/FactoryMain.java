package factorDesignPattern;

public class FactoryMain {
	public static void main(String[] args) {
		FactoryDesign f=new FactoryDesign();
		f.getPen(new InkPen());
		
		FactoryDesign f1=new FactoryDesign();
		f1.getPen(new SketchPen());
		
		FactoryDesign f2=new FactoryDesign();
		f2.getPen(new MarkerPen());
	}

}
