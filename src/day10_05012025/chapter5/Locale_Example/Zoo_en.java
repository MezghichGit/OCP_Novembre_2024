package day10_05012025.chapter5.Locale_Example;

import java.util.ListResourceBundle;

public class Zoo_en extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return new Object [][]{
			{"hello","Hello class"},
			{"open","Open class"}
		};
	}

}
