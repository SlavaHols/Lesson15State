package lt.lhu.lesson15.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {

	private List<City> cities = new ArrayList<City>();
	private String title;
	private int area;

	public District(List<City> cities, String title, int area) {
		this.cities = cities;
		this.title = title;
		this.area = area;

	}

	public District() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "District [cities=" + cities + ", title=" + title + ", area=" + area + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cities, area, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Objects.equals(cities, other.cities) && area == other.area && Objects.equals(title, other.title);
	}

}
