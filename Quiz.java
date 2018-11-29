package edu.unca.csci201;

import java.util.Scanner;

class Quiz {

    private Question[] prompts;
    private double score;

    public Quiz() {

        prompts = new Question[20];

    }
    
  

    public void addQuestion(Question q) {

        for (int i = 0; i < prompts.length; i++) {

            if (prompts[i] == null) {
                prompts[i] = q;
                return;
            }
        }

    }

    public double giveQuiz() {

        double score = 0;
        Scanner userInput = new Scanner(System.in);
        
        //String answerAttempt = userInput.nextLine();
        
        for (int j =0; j < prompts.length; j++){
            
            System.out.println(prompts[j].getTheQuestionText());
            String answerAttempt = userInput.nextLine();
       
            
           if (prompts[j].isCorrectAnswer(answerAttempt)){
                score++;
            } //else {
            	//System.out.println("Sorry that is incorrect");
           // }
           // System.out.println("You got " + score + " out of " + prompts.length + " possible" );
        }   
        
        System.out.println("hey dumbass!"+ score);
            
       return score;
        
   
}



	public double getScore() {
		return score;
	}



	public void setScore(double score) {
		this.score = score;
	}
}
