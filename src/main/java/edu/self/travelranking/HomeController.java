package edu.self.travelranking;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private RankingDao rankingDao;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		//テスト用
		int i = 0;
		Ranking[] rankingList = new Ranking[10];
		for (i = 0; i < 10; i++) {
			Ranking ranking = new Ranking();
			ranking.setName("TEST" + i);
			ranking.setRanking(i + 1);
			ranking.setId(i);
			rankingList[i] = ranking;
		}
		
		logger.info("test: {}", rankingDao);
		model.addAttribute("rankingList", rankingList);
		
		return "home";
	}
	
}
