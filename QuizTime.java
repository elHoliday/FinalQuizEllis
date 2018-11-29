package edu.unca.csci201;

public class QuizTime {

		
	    public static void main(String[] args) {

		        Quiz futurePast = new Quiz();
		        String text;
		        String answer;
		        String correctAnswer;
		        double score;
		        

		        Question one = new MultipleChoice("What was the top grossing film made in the 1980's?\n"
		                + "(a)Star Wars, The Empire Strikes Back\n(b)ET\n(c)Back to the Future", "b");
		        Question two = new MultipleChoice("In which installment of the Indianna Jones trilogy does our hero battle Hiltler and the Nazis?\n"
		                + "(a)Last Crusade\n(b)Temple of Doom\n(c)Raiders of the Lost Ark", "c");
		        Question three = new MultipleChoice("In what city is Ferris Buleers Day Off Filmed?\n"
		                + "(a)Detroit\n(b)Chicago\n(c)Phillidelphia", "b");
		        Question four = new MultipleChoice("What 80's film was the first to air music videos on MTV?\n"
		                + "(a)Ghostbusters\n(b)Beverly Hills Cop\n(c)Flashdance", "c");
		        Question five = new MultipleChoice("In 1987 the immortal words \'Hello, my name is Inigo Montoya. You killed my father. Prepare to die!\'were spoken in which film?\n"
		                + "(a)Princess Bride\n(b)Batman\n(c)The Color Purple", "a");
		        Question six = new MultipleChoice("What artist sang the 1986 song Danger Zone from Top Gun?\n"
		                + "(a)Boy George\n(b)Bruce Springsteen\n(c)Kenny Loggins", "c");
		        Question seven = new MultipleChoice("In 'Dirty Dancing' what was Baby's real name?\n"
		                + "(a)Susan\n(b)Courage\n(c)Frances", "c");
		        Question eight = new TrueOrFalse("In nightmare on Elm Street Alice kills Freddy by setting him on fire?\n"
		                + "true or false", "false", "She shows him his own reflection");
		        Question nine = new TrueOrFalse("Yoda tells Obi One in Empire Strikes back that there will be another Jedi.\n"
		                + "true or false", "true", "it was Princess Leia");
		        Question ten = new TrueOrFalse("Jennifer Beals used a body double for her stripper scenes in Flashdance?\n"
		                + "true or false", "true", "Marine Jahan was the actress cast as the body double");
		        Question eleven = new TrueOrFalse("Jennifer Beals used a body double for her stripper scenes in Flashdance?\n"
		                + "true or false", "true", "Marine Jahan was the actress cast as the body double");
		        Question twelve = new TrueOrFalse("Jennifer Beals used a body double for her stripper scenes in Flashdance?\n"
		                + "true or false", "true", "Marine Jahan was the actress cast as the body double");
		        Question thirteen = new TrueOrFalse("Jennifer Beals used a body double for her stripper scenes in Flashdance?\n"
		                + "true or false", "true", "Marine Jahan was the actress cast as the body double");
		        Question fourteen = new TrueOrFalse("Jennifer Beals used a body double for her stripper scenes in Flashdance?\n"
		                + "true or false", "true", "Marine Jahan was the actress cast as the body double");
		        Question fifteen = new ShortAnswer("These tiny creatures perform a weird celebration dance at the end of Return Of The Jedi. What are they called?",
		                 "Ewoks");
		        Question sixteen = new ShortAnswer("Who played Batman in the 1989 film?",
		                 "Michael Keaton");
		        Question seventeen = new ShortAnswer("In 1986 Whoopie Goldberg won the Golden Globe for best actress in this film directed by Steven Speilberg?",
		                 "The Color Purple");
		        Question eighteen = new ShortAnswer("The quote, \'Where we\'re going we don\'t need roads.\' is a quote from which 1985 film?",
		                 "Back To The Future");
		        Question nineteen = new ShortAnswer("What 1980's film was about, \'a brian, an athlete, a basket case and a crminal\'?",
		                 "The Breakfast Club");
		        Question twenty = new ShortAnswer("Back to the Future was originally called something else. What was this 1985 films original title?",
		                 "Spacemen From Pluto");

		        futurePast.addQuestion(one);
		        futurePast.addQuestion(two);
		        futurePast.addQuestion(three);
		        futurePast.addQuestion(four);
		        futurePast.addQuestion(five);
		        futurePast.addQuestion(six);
		        futurePast.addQuestion(seven);
		        futurePast.addQuestion(eight);
		        futurePast.addQuestion(nine);
		        futurePast.addQuestion(ten);
		        futurePast.addQuestion(eleven);
		        futurePast.addQuestion(twelve);
		        futurePast.addQuestion(thirteen);
		        futurePast.addQuestion(fourteen);
		        futurePast.addQuestion(fifteen);
		        futurePast.addQuestion(sixteen);
		        futurePast.addQuestion(seventeen);
		        futurePast.addQuestion(eighteen);
		        futurePast.addQuestion(nineteen);
		        futurePast.addQuestion(twenty);

		        futurePast.giveQuiz();
		        
		       

		    }

		}


	

