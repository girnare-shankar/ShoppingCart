package com.ShoppingWithOutReturn;

public class ShoppingWithOutReturn{
	
	 
	void gstOnItems(int tab, int mob) {
		
		
		int tab1=(tab*15/100)+tab;
		
		System.out.println("Price Of Tab with 15% GST : "+tab1);
		
		int mob1=(mob*15/100)+mob;
		System.out.println("Price Of Mobile with 15% GST : "+mob1);
		
		int tPrice=tab1+mob1;
		System.out.println("Total Price of Electronic items with GST : "+tPrice);
	//-----------------------------------------------------------------------------//
		int shirt=399;
		int shirt1=(shirt*8/100)+shirt;
		System.out.println("\nPrice Of Shirt with 8% GST : "+shirt1);

	//-----------------------------------------------------------------------------//	
			int chat =49;
		
		int chat1=(chat*5/100)+chat;
		System.out.println("\nPrice Of Chat with GST : "+chat1);
		
		int paw =15;
		int paw1=(paw*5/100)+paw;
		System.out.println("price of paw with GST: "+paw);
		
	//-------------------------------------------------------------------- ---------//	

		int total=(tPrice+shirt1+chat1);
		System.out.println("\nTotal Amount Without Discount : "+total);
		
		int	dis=(total*25/100);
		
		int withDisc=total-dis;
		System.out.println("Total Amout Of All Items With 25% Discount: "+withDisc);
	}
		
	}
