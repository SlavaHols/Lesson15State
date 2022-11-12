package lt.lhu.lesson15.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class  Region  {
	private List<District> district = new ArrayList<District>();
	private String title;
	private int area;

	
	public Region (List<District> district, String title, int area) {
		this.district = district;
		this.title = title;
		this.area = area;
	}

	
	public Region() {
		
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

	public List<District> getDistrict() {
		return district;
	}

	public void setDistrict(List<District> district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "Region [district=" + district + ", title=" + title + ", area=" + area + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, district, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return area == other.area && Objects.equals(district, other.district) && Objects.equals(title, other.title);
	}

}
