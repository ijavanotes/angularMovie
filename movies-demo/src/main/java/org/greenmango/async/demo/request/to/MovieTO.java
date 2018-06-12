package org.greenmango.async.demo.request.to;

import java.text.SimpleDateFormat;

import org.greenmango.async.demo.dao.vo.MovieVO;

public class MovieTO {
private String title;
private String director;
private String releaseDate;
private String type;
private Integer id;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public String getReleaseDate() {
	return releaseDate;
}
public void setReleaseDate(String releaseDate) {
	this.releaseDate = releaseDate;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}



}
