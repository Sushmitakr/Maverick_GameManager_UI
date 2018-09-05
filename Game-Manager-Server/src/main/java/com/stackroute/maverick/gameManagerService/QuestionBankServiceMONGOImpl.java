package com.stackroute.maverick.gameManagerService;
/*package com.stackroute.gameManager.gameManagerService;

import org.springframework.beans.factory.annotation.Autowired;


import com.stackroute.gameManager.domain.QuestionsBank;
import com.stackroute.gameManager.repository.QuestionBankRepository;

public class QuestionBankServiceMONGOImpl implements QuestionBankService{

	QuestionBankRepository questionBankRepository;
	
	@Autowired
	public QuestionBankServiceMONGOImpl(QuestionBankRepository questionBankRepository) {
		super();
		this.questionBankRepository = questionBankRepository;
		
		
	}
	
	@Override
	public QuestionsBank addQuestionsBank(QuestionsBank questionsBank) {
		// TODO Auto-generated method stub
		System.out.println("Hello from repo");
		
		try {
			
			questionBankRepository.save(questionsBank);
			
		}catch(Exception e) {
			System.out.println("Hiiiiiiii");
			e.printStackTrace();
		}
		
		return questionsBank;
	}
	

	@Override
	public Iterable<QuestionsBank> getAllQuestionBank() {
		// TODO Auto-generated method stub
		Iterable<QuestionsBank> questionBankList = questionBankRepository.findAll();
		return questionBankList;
	}




	
	
	
}
*/