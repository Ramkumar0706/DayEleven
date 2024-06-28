package facadeDesignPattern;

public class Samsung  implements MobileShop{

	@Override
	public void modelNo() {
		System.out.println("the samsung model is S22 ultra");
	}

	@Override
	public void price() {
		System.out.println("the price is 12000");
	}
	

}
