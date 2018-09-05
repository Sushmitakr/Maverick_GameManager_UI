package com.stackroute.maverick.kafkaservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.stackroute.maverick.domain.Category;
import com.stackroute.maverick.domain.Game;

@Service
public class KafkaProducer {

	@Value("gameManager.t")
	String kafkaTopic;
	
	@Value("GameDetails.t")
	String kafkaTopic1;

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	public void send(Game gameManager) {
		kafkaTemplate.send(kafkaTopic1, gameManager);
	}

	public void send1(Category game) {
		kafkaTemplate.send(kafkaTopic, game);
	}
}
