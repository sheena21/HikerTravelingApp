package com.hiker.HikerApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;


@Entity
public class Trek {
    
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50)
	private String trekName;
	
	@Column(length = 50)
	private String state;
	
	@Column(length = 200)
	private String description;
	
	private String rating;
	private Integer totalDays;
	
	@Column(length = 10)
	private String weather;
	
	private Integer cost;
	
	private boolean status;

	public Trek(List<Trek> list, String rating) {
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTrekName() {
		return trekName;
	}

	public void setTrekName(String trekName) {
		this.trekName = trekName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(Integer totalDays) {
		this.totalDays = totalDays;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Trek()
	{}

	public Trek(Integer id, String trekName, String state, String description,
				String rating, Integer totalDays, String weather, Integer cost, boolean status) {
		this.id = id;
		this.trekName = trekName;
		this.state = state;
		this.description = description;
		this.rating = rating;
		this.totalDays = totalDays;
		this.weather = weather;
		this.cost = cost;
		this.status = status;
	}


}
