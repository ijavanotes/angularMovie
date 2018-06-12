package org.greenmango.async.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.greenmango.async.demo.dao.DaoService;
import org.greenmango.async.demo.dao.vo.MovieVO;
import org.greenmango.async.demo.to.MovieTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	private DaoService daoService;
	Logger log = LoggerFactory.getLogger(this.getClass().getName());
	
	public List<MovieTO> allResults()
	{
	return daoService.getAllMovie();
		
	}
	public String addMovie(org.greenmango.async.demo.request.to.MovieTO movie) throws ParseException
	{
		 SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		MovieVO movieVO = new MovieVO();
		movieVO.setTitle(movie.getTitle());
		movieVO.setDirector(movie.getDirector());
		movieVO.setType(movie.getType());
		movieVO.setReleaseDate(df.parse(movie.getReleaseDate()));
		return daoService.addMovie(movieVO);
		
	}
	public String updateMovie(org.greenmango.async.demo.request.to.MovieTO movie) throws ParseException
	{
		 SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		MovieVO movieVO = new MovieVO();
		movieVO.setTitle(movie.getTitle());
		movieVO.setDirector(movie.getDirector());
		movieVO.setType(movie.getType());
		movieVO.setReleaseDate(df.parse(movie.getReleaseDate()));
		movieVO.setId(movie.getId());
		return daoService.updateMovie(movieVO);
		
	}
	public String deleteMovie(org.greenmango.async.demo.request.to.MovieTO movie) throws ParseException
	{
		MovieVO movieVO = new MovieVO();
		movieVO.setId(movie.getId());
		return daoService.deleteMovie(movieVO);
		
	}
	@Autowired
	public void setDaoService(DaoService daoService) {
		this.daoService = daoService;
	}
	
	
}
