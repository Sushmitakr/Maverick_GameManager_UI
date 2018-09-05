	package com.stackroute.maverick.gameManagerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.maverick.domain.Category;
import com.stackroute.maverick.domain.Game;
import com.stackroute.maverick.repository.CategoryRepository;
import com.stackroute.maverick.repository.GameManagerRepository;



@Service
public class GameManagerServiceMONGOImpl implements GameManagerService{
	
	GameManagerRepository gameManagerRepository;
	
	CategoryRepository categoryRepo;
	
	@Autowired
	public 	GameManagerServiceMONGOImpl(GameManagerRepository gameManagerRepository)
	{
		super();
		this.gameManagerRepository = gameManagerRepository;
	}
	
	
	@Override
	public Game addGameManager(Game gameManager)
	{
		//System.out.println(gameManager.getQuestionLevels().getAdvlevel());
		try
		{
			gameManagerRepository.save(gameManager);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return gameManager;
	}
	
	@Override
	public Iterable<Game> getAllGameManagers() {
		Iterable<Game> gameManagerlist = gameManagerRepository.findAll();
				return gameManagerlist;
	}

	@Override
	public Game saveQuestions(Game game) {
		// TODO Auto-generated method stub
		Game gameSaveQuestionList = gameManagerRepository.save(game);
		return gameSaveQuestionList;
	}

	@Override
	public Game getGameById(int id) {
		Game gameById = gameManagerRepository.findById(id).orElse(null);
		return gameById;
	}

	@Override
	public Game updateGameById(int id, Game game) {
		Game updateGame = gameManagerRepository.save(game);
		return updateGame;
	}

	@Override
	public Category saveCategories(Category category) {
		Category saveCategoryList = categoryRepo.save(category);
		return saveCategoryList;
	}

	/*@Override
	public Game findByTopic(int questionLevel) {
		// TODO Auto-generated method stub
		
		return gameManagerRepository.findQuestionByTopic(questionLevel);
		
	}*/
	

	/*@Override
	public Game findGameById(int id) {
		Game foundQuestion = gameManagerRepository.findById(id).orElse(null);
		return foundQuestion;
	}*/

	/*@Override
	public boolean checkid(int id) {
		return gameManagerRepository.existsById(id);
	}*/
}
