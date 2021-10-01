package org.pedro.animes.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "animes")
public class Anime implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id_anime;
	
	String title;
	
	String studio;
	
	int year;

	public long getId() {
		return id_anime;
	}

	public void setId(long id) {
		this.id_anime = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Anime(long id, String title, String studio, int year) {
		super();
		this.id_anime = id;
		this.title = title;
		this.studio = studio;
		this.year = year;
	}
	
	public Anime() {}

}
