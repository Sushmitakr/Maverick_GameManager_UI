package com.stackroute.maverick.controller;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.maverick.domain.Category;
//@CrossOrigin(origins = "http://localhost:4200")
import com.stackroute.maverick.domain.Game;
import com.stackroute.maverick.domain.Topic;
import com.stackroute.maverick.gameManagerService.GameManagerService;
import com.stackroute.maverick.kafkaservices.KafkaProducer;
import com.stackroute.maverick.repository.CategoryRepository;

@CrossOrigin("*")
@RequestMapping("api/game")
@RestController
public class GameManagerController {

	@Autowired
	GameManagerService gameManagerService;

	@Autowired
	KafkaProducer kafkaProducer;

	@Autowired
	CategoryRepository categoryRepo;

	@GetMapping(value = "/producer")
	public String producer(Game gameManager) {
		return "Message sent to the kafka topic game_manager successfully";
	}

	@RequestMapping(value = "/gameManager", method = RequestMethod.POST)
	public ResponseEntity<Game> addGameManager(@RequestBody Game gameManager) throws Exception {

		// System.out.println(gameManager.getQuestionLevels().getAdvlevel());

		Game newGameManager = gameManagerService.addGameManager(gameManager);
		kafkaProducer.send(newGameManager);
		return new ResponseEntity<Game>(newGameManager, HttpStatus.OK);

	}

	@RequestMapping(value = "/gameManager", method = RequestMethod.GET)
	public ResponseEntity showAllGameManager() {
		return new ResponseEntity<>(gameManagerService.getAllGameManagers(), HttpStatus.OK);
	}

	@RequestMapping(value = "/gameManager/{id}", method = RequestMethod.GET)
	public ResponseEntity findGameById(@PathVariable(value = "id") String id) {
		int id1 = Integer.parseInt(id);
		System.out.println(id1);

		return new ResponseEntity<>(gameManagerService.getGameById(id1), HttpStatus.OK);
	}

	@RequestMapping(value = "/modifiedGame/{id}", method = RequestMethod.GET)
	public ResponseEntity updateGameById(@PathVariable(value = "id") String id, @RequestBody Game game) {
		int id1 = Integer.parseInt(id);

		return new ResponseEntity<>(gameManagerService.updateGameById(id1, game), HttpStatus.OK);
	}

	@RequestMapping(value = "/game", method = RequestMethod.POST)
	public ResponseEntity saveAllQuestions(@RequestBody Game game) {
		return new ResponseEntity<>(gameManagerService.saveQuestions(game), HttpStatus.OK);
	}

	@RequestMapping(value = "/category", method = RequestMethod.POST)
	public ResponseEntity saveCategory(@RequestBody Category category) {
		return new ResponseEntity<>(gameManagerService.saveCategories(category), HttpStatus.OK);
	}

	/*
	 * Get a particular topic by topic name in a category by category name
	 */
	@RequestMapping(value = "/category/{categoryId}/{topicName}", method = RequestMethod.POST)
	public ResponseEntity<Game> findByTopicNameUnderACategory(@RequestBody Game game,
			@PathVariable(value = "categoryId") int categoryId, @PathVariable(value = "topicName") String topicName) {

		Topic foundTopic = null;
		Game game1 = new Game();
		game1.setGameId(game.getGameId());
		game1.setGameImage(game.getGameImage());
		game1.setCreatedBy(game.getCreatedBy());
		game1.setCreatedOn(game.getCreatedOn());
		game1.setGameType(game.getGameType());
		game1.setGameDescription(game.getGameDescription());
		game1.setGameRules(game.getGameRules());
		game1.setGamePopularity(game.getGamePopularity());
		game1.setQuestionLevels(game.getQuestionLevels());
		game1.setQuestionTime(game.getQuestionTime());
		game1.setQuestionScore(game.getQuestionScore());
		Optional<Category> foundCategoryById = categoryRepo.findById(categoryId);
		Iterator<Topic> itr = foundCategoryById.get().getTopic().iterator();
		while (itr.hasNext()) {
			Topic str = itr.next();
			if (str.getTopicName().equalsIgnoreCase(topicName)) {
				foundTopic = str;
			}
		}
		game1.setTopic(foundTopic);	
		gameManagerService.addGameManager(game1);
		kafkaProducer.send(game1);
		return new ResponseEntity<Game>(game1, HttpStatus.OK);
	}
}

/*
 * @RequestMapping(value = "/questiontopic/{questionLevel}", method =
 * RequestMethod.GET) public ResponseEntity<Game>
 * findByTopic(@PathVariable(value = "questionLevel") int questionLevel) { Game
 * questionByTopic = GameManagerServiceMONGOImpl.findByTopic(questionLevel);
 * return new ResponseEntity<Game>(questionByTopic, HttpStatus.OK); }
 */

/*
 * System.out.println("ello"+gameManagerService.checkid(gameManager.getGameId())
 * );
 * 
 * if(!gameManagerService.checkid(gameManager.getGameId())) { GameManager
 * newGameManager= gameManagerService.addGameManager(gameManager); return new
 * ResponseEntity<GameManager>(newGameManager,HttpStatus.OK); } else { throw new
 * Exception("game with id "+gameManager.getGameId()+" already exit"); }
 */