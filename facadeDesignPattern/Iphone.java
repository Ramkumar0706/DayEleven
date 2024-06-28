package facadeDesignPattern;

public class Iphone implements MobileShop {

	@Override
	public void modelNo() {
		System.out.println("the Iphone model is 14 Pro");
	}

	@Override
	public void price() {
		System.out.println("the price is Rs : 140000 ");
	}

}
