package edu.unca.csci201;

public class TrueOrFalse implements Question {
	
	private String text;
	private String answer;
	private String correctAnswer;
	
	public TrueOrFalse(String text, String answer, String correctAnswer) {
		this.text = text;
		this.answer = answer;
		this.correctAnswer = correctAnswer;
	}


	@Override
	public String getTheQuestionText() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return answer;
	}


	public void setTFAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
	public String getTFAnswer() {
		return correctAnswer;
	}

}
