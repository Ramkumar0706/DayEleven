package facadeDesignPattern;

import java.util.Scanner;

public class FacdeDesignPatternMain {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		ShopKeeper sk=new ShopKeeper();  
		boolean br=true;
		while(br) {
			System.out.print("========= Mobile Shop ============ \n");  
			System.out.print("1.IPHONE");  
			System.out.print("2.SAMSUNG");  
			System.out.print("3.REDMI");  
			System.out.print("4.Exit.");  
			System.out.print("Enter your choice: ");  
			int choice=scan.nextInt();
			switch(choice) {
			case 1:  
			{   
				sk.iPhoneSale();  
			}  
			break;  
			case 2:  
			{  
				sk.samsungSale();        
			}  
			break;    
			case 3:  
			{  
				sk.redmiSale();       
			}  
			break;    
			case 4 :{
				System.out.println("thank you for visiting our shop");
				br=false;
				break;
			}
			default:  
			{    
				System.out.println("Nothing You purchased");  
			}         
			}
		}
		scan.close();
	}

}
