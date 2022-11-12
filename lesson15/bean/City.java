package lt.lhu.lesson15.bean;

import java.util.Objects;

public class City {
	private String title;
	private int population;
	private int area;

	public City(String title, int population, int area) {
		this.title = title;
		this.population = population;
		this.area = area;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "City [title=" + title + ", population=" + population + ", area=" + area + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(population, area, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return population == other.population && area== other.area && Objects.equals(title, other.title);
	}

}
