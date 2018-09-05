package com.stackroute.maverick.gameManagerService;

import com.stackroute.maverick.domain.Category;
import com.stackroute.maverick.domain.Game;

public interface GameManagerService {
	public Game addGameManager(Game gameManager);
	public Game getGameById(int id);
	public Iterable<Game> getAllGameManagers();
	public Game saveQuestions(Game game);
	public Category saveCategories(Category category);
	public Game updateGameById(int id, Game game);

}
