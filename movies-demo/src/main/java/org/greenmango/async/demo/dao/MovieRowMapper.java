package org.greenmango.async.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.greenmango.async.demo.dao.vo.MovieVO;
import org.springframework.jdbc.core.RowMapper;

public class MovieRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		
		MovieVO movie = new MovieVO();
		movie.setId(rs.getInt("id"));
		movie.setReleaseDate(rs.getDate("releaseDate"));
		movie.setTitle(rs.getString("title"));
		movie.setTitle(rs.getString("type_desc"));
		return movie;
	}

}
