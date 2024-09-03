package com.ShoppingWithReturn;

public class Shopping {

	public float eleIncGST(int e1, int e2) {

		int mob = (e1 * 15 / 100) + e1;
		int laptop = (e2 * 15 / 100) + e2;

		int gstTotal = mob + laptop;

		System.out.println("price of Electronic items with GST: " + gstTotal);

		return gstTotal;
	}

	public float foodIncGST(int f1, int f2) {

		int smosa = (f1 * 15 / 100) + f1;

		int kachori = (f2 * 15 / 100) + f2;

		int fgst = smosa + kachori;
		System.out.println("Price of Food itms with GST: " + fgst);
		return fgst;
	}

	public float clothIncGST(int c1) {

		int cgst = (c1 * 15 / 100) + c1;
		System.out.println("Price of cloth itms with GST: " + cgst);
		return cgst;
	}

	void finalprice(int e1, int e2, int f1, int f2, int c1) {

		float gstTotal = eleIncGST(e1, e2);

		float fgst = foodIncGST(f1, f2);

		float cgst = clothIncGST(c1);

		float totalPrice = gstTotal + fgst + cgst;
		System.out.println("\ntotal price with gst :" + totalPrice);

		float discountPrice = totalPrice - (totalPrice * 25 / 100);
		System.out.println("price with 25% of discount :" + discountPrice);

	}

}
