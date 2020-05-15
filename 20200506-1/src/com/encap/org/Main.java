/*
 * Ä¸½¶È­
 */
package com.encap.org;

class TakeMedicine{
	private void Atake(AMedicine am) {
//		AMedicine am = new AMedicine();
		am.take();
	}
	private void Btake(BMedicine bm) {
//		BMedicine bm = new BMedicine();
		bm.take();
	}
	private void Ctake(CMedicine cm) {
//		CMedicine cm = new CMedicine();
		cm.take();
	}
	public void ABCtake(
			AMedicine am,BMedicine bm, CMedicine cm) {
		Atake(am);
		Btake(bm);
		Ctake(cm);
//		am.take();
//		bm.take();
//		cm.take();
	}
}
public class Main {
	
	public static void main(String[] args) {
		TakeMedicine tm = new TakeMedicine();
		AMedicine am = new AMedicine();
		BMedicine bm = new BMedicine();
		CMedicine cm = new CMedicine();

		tm.ABCtake(am, bm, cm);	
//		tm.Atake(am);
//		tm.Btake(bm);
//		tm.Ctake(cm);
//		
//		tm.Ctake(cm);
		
		
	}
}
