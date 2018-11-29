package edu.unca.csci201;

public class MultipleChoice implements Question {
	
	private String text;
	private String answer;
	
	public MultipleChoice(String text, String answer) {
		this.text = text;
		this.answer = answer;
	}
	
	/*public String toString() {
		
		return text;
	}*/

	@Override
	public String getTheQuestionText() {
			
		return text;
	}

	@Override
	public boolean isCorrectAnswer(String answer) {
            
            if (this.answer.equals(answer)){
	
		return true;
            }
            return false;
	}
        

	@Override
	public String getCorrectAnswer() {
		
		return answer;
	}

}
