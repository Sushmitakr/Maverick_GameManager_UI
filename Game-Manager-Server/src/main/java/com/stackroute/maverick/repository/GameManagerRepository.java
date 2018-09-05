package com.stackroute.maverick.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.maverick.domain.Game;

@Repository
public interface GameManagerRepository extends CrudRepository<Game,Integer>  {
	
	public Game findByGameId(int gameId);

	//@Query
	//public Game findQuestionByTopic(int questionLevel);
			//public Game findAllById(int id, Game game);
		
	
	
		/*@Query
		public Restaurant findByNameAndByLocation(String name, String location);*/
	
}
