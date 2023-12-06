package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public abstract class Media {
	private static int id = 0;
	private String title;
	private String category;
	private float cost;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	public Media(String title,String category,float cost) {
		this.setCategory(category);
		this.setCost(cost);
		this.setId();
		this.setTitle(title);
	}
	
	public String toString() {
		return this.title + " " + this.category + " " + this.cost;
	}
	public boolean equals(Object o) {
		if(o instanceof Media) {
			Media s = (Media) o;
			if(this.title.equals(s.getTitle()) == true) {
				return true;
			}
			return false;
		}
		return false;
	}
	public int getId() {
		return Media.id;
	}
	public void setId() {
		++Media.id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
}
