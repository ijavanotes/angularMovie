package org.greenmango.async.demo.controller;

import java.text.ParseException;
import java.util.List;

import org.greenmango.async.demo.service.MovieService;
import org.greenmango.async.demo.to.BaseResponse;
import org.greenmango.async.demo.to.IResponse;
import org.greenmango.async.demo.to.MovieTO;
import org.greenmango.async.demo.to.StatusTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
	@Autowired
	private MovieService movieService;

	@RequestMapping("/allmovies")
	public IResponse<List<MovieTO>> asyncController() {
		BaseResponse<List<MovieTO>> response = new BaseResponse<List<MovieTO>>(movieService.allResults(),
				new StatusTO(200, "Success"));
		return response;
		// return "hello";
	}

	@RequestMapping(value="/addMovie" ,method = RequestMethod.POST)
	public IResponse<String> asyncController(@RequestBody org.greenmango.async.demo.request.to.MovieTO movie) throws ParseException {
		String result = movieService.addMovie(movie);
		BaseResponse<String> response = new BaseResponse<String>(result, new StatusTO(200, "Success"));
		return response;
		// return "hello";
	}
	
	@RequestMapping(value="/updateMovie" ,method = RequestMethod.POST)
	public IResponse<String> asyncControllerUpdate(@RequestBody org.greenmango.async.demo.request.to.MovieTO movie) throws ParseException {
		String result = movieService.updateMovie(movie);
		BaseResponse<String> response = new BaseResponse<String>(result, new StatusTO(200, "Success"));
		return response;
		// return "hello";
	}
	
	@RequestMapping(value="/deleteMovie" ,method = RequestMethod.POST)
	public IResponse<String> asyncControllerdelete(@RequestBody org.greenmango.async.demo.request.to.MovieTO movie) throws ParseException {
		String result = movieService.deleteMovie(movie);
		BaseResponse<String> response = new BaseResponse<String>(result, new StatusTO(200, "Success"));
		return response;
		// return "hello";
	}

}
