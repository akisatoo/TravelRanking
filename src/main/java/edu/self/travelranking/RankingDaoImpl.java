package edu.self.travelranking;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class RankingDaoImpl extends JdbcDaoSupport implements RankingDao {
	public List<Ranking> getRankingList() throws DataAccessException {
		RowMapper<Ranking> rowMapper = new RankingRowMapper();
		return getJdbcTemplate().query("SELECT * FROM ranking", rowMapper);
	}
	
	protected class RankingRowMapper implements RowMapper<Ranking> {
		private List<Ranking> rankingList = new ArrayList<Ranking>();
		public List<Ranking> getResults() {
			return rankingList;
		}
		public Ranking mapRow(ResultSet rs, int rowNum) throws SQLException {
			Ranking ranking = new Ranking();
			ranking.setId(rs.getInt("id"));
			ranking.setName(rs.getString("name"));
			ranking.setUrl(rs.getString("url"));
			ranking.setRanking(rs.getInt("ranking"));
			ranking.setDescription(rs.getString("description"));
			return ranking;
		}
	}
}