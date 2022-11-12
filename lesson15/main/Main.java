package lt.lhu.lesson15.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lt.lhu.lesson15.LogicState.LogicState;
import lt.lhu.lesson15.bean.City;
import lt.lhu.lesson15.bean.District;
import lt.lhu.lesson15.bean.Region;
import lt.lhu.lesson15.bean.State;

public class Main {

	public static void main(String[] args) {
		City c1 = new City("Polotsk", 500_000, 20_000);
		City c2 = new City("Vitsebsk", 300_000, 10_000);
		City c3 = new City("Gorodok", 450_000, 25_000);

		City c4 = new City("Minsk", 50_000, 5_000);
		City c5 = new City("Bobruysk", 120_000, 10_000);
		City c6 = new City("Borisov", 600_000, 10_000);

		City c7 = new City("Brest", 700_000, 8_000);
		City c8 = new City("Pinsk", 500_000, 20_000);
		City c9 = new City("Kobrin", 120_000, 8_000);

		District vitsebskiy = new District();
		vitsebskiy.getCities().add(c1);
		vitsebskiy.getCities().add(c2);
		vitsebskiy.getCities().add(c3);

		District minskiy = new District();
		minskiy.getCities().add(c4);
		minskiy.getCities().add(c5);
		minskiy.getCities().add(c6);

		District brestskiy = new District();
		brestskiy.getCities().add(c7);
		brestskiy.getCities().add(c8);
		brestskiy.getCities().add(c9);

		Region vitsebskaya = new Region();
		vitsebskaya.getDistrict().add(vitsebskiy);

		Region minskaya = new Region();
		minskaya.getDistrict().add(minskiy);

		Region brestskaya = new Region();
		brestskaya.getDistrict().add(brestskiy);

		State belarus = new State();
		belarus.getRegion().add(vitsebskaya);
		belarus.getRegion().add(minskaya);
		belarus.getRegion().add(brestskaya);
		belarus.setCapital("Minsk");

		LogicState ls1 = new LogicState(); // ничего не получается дальше, как найти сумму площадей, городов, районов, областей, страны.
		
		
		
	}

}
