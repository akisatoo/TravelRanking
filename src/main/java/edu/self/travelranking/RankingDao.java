package edu.self.travelranking;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface RankingDao {
	List<Ranking> getRankingList() throws DataAccessException;
}