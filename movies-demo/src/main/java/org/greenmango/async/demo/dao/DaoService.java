package org.greenmango.async.demo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.greenmango.async.demo.dao.vo.MovieVO;
import org.greenmango.async.demo.to.MovieTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class DaoService {
	Logger log = LoggerFactory.getLogger(this.getClass().getName());
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	final String INSERT_QUERY = "insert into movie (title, releaseDate,type_desc,director) values (?, ?,?,?)";
    final String UPDATE_QUERY = "update movie set title = ?, releaseDate=?, type_desc=?, director=? where id = ?";
    final String DELETE_QUERY = "delete from movie where id = ?";
	@Autowired
	 public void setDataSource(DataSource dataSource) {
			
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		
			
	}
	 public List<MovieTO>  getAllMovie()
	 {
		String sql ="select * from movie";
		List<MovieTO> movies = new ArrayList<MovieTO>();
		
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map row : rows) {
			MovieVO movie = new MovieVO(); 
			movie.setId((Integer)row.get("id"));
			movie.setReleaseDate((Date)row.get("releaseDate"));
			movie.setTitle((String)row.get("title"));
			movie.setDirector((String)row.get("director"));
			movie.setType((String)row.get("type_desc"));
			MovieTO movieTO = new MovieTO(movie);
			movies.add(movieTO);
		}
			
		return movies;
	 }

	public String addMovie(MovieVO movie)
	{
		jdbcTemplate.update(INSERT_QUERY, movie.getTitle(), movie.getReleaseDate(), movie.getType(), movie.getDirector());
		return "Successfully added movie";
	}
	
	public String updateMovie(MovieVO movie)
	{
		jdbcTemplate.update(UPDATE_QUERY, movie.getTitle(), movie.getReleaseDate(), movie.getType(), movie.getDirector(), movie.getId());
		return "Successfully updated movie";
	}
	
	public String deleteMovie(MovieVO movie)
	{
		jdbcTemplate.update(DELETE_QUERY, movie.getId());
		return "Successfully deleted movie";
	}
	
	
}
