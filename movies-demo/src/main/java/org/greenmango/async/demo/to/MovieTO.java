package org.greenmango.async.demo.to;

import java.text.SimpleDateFormat;

import org.greenmango.async.demo.dao.vo.MovieVO;

public class MovieTO {
private String title;
private String director;
private String releaseDate;
private String type;
private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
public MovieTO(MovieVO movie )
{
	this.title= movie.getTitle();
	this.director= movie.getDirector();
	this.releaseDate =df.format( movie.getReleaseDate().getTime());
	this.type= movie.getType();
}
public String getTitle() {
	return title;
}
public String getDirector() {
	return director;
}
public String getReleaseDate() {
	return releaseDate;
}
public String getType() {
	return type;
}


}
