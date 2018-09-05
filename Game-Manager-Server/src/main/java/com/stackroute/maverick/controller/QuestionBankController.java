package com.stackroute.maverick.controller;
/*package com.stackroute.gameManager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.gameManager.domain.QuestionsBank;
import com.stackroute.gameManager.gameManagerService.QuestionBankService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/ques")
@RestController
public class QuestionBankController {

	QuestionBankService questionBankService;
	
	@RequestMapping(value="/questionBank", method = RequestMethod.POST)
	public ResponseEntity<QuestionsBank> addQuestionsBank(@RequestBody QuestionsBank questionsBank) throws Exception{
		
		System.out.println("Hello from controller " + questionsBank.getTopic());
		QuestionsBank newQuestionBank = questionBankService.addQuestionsBank(questionsBank);
		
		return new ResponseEntity<QuestionsBank>(newQuestionBank, HttpStatus.OK );
	}
	
	
	 @SuppressWarnings("rawtypes")
	@RequestMapping(value="/questionBank", method = RequestMethod.GET)
	public ResponseEntity showAllQuestions()
	{
		return new ResponseEntity<>(questionBankService.getAllQuestionBank(),HttpStatus.OK);
	}
}
*/