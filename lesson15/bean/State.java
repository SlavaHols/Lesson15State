package lt.lhu.lesson15.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class State {
	private List<Region> region = new ArrayList<Region>();
	private String title;
	private String capital;
	

	public State(List<Region> region, String title, String capital) {
		this.region = region;
		this.title = title;
		this.capital = capital;
	}

	public State() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public List<Region> getRegion() {
		return region;
	}

	public void setRegion(List<Region> region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "State [title=" + title + ", capital=" + capital + ", region=" + region + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(capital, region, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Objects.equals(capital, other.capital) && Objects.equals(region, other.region)
				&& Objects.equals(title, other.title);
	}

}
