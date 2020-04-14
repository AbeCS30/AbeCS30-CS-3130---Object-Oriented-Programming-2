
public class TrueFalseQuestion {
	private String text = "nll";
	private String answer = "nll";
	public TrueFalseQuestion() {
		text = "What color is the sky?";
		answer = "blue";
	}
	public void setText(String newText) {
		text = newText;
	}
	public void setAnswer(String newAnswer) {
		answer = newAnswer;
	}
	public boolean checkAnswer(String userAnswer) {
		if (answer.equalsIgnoreCase(userAnswer)) {return true;
		}else if (userAnswer.equalsIgnoreCase("f") && answer.equalsIgnoreCase("false")) {
			return true;
		} else if (userAnswer.equalsIgnoreCase("t") && answer.equalsIgnoreCase("true")) {
			return true;
		}
		return false;
	}
	public void display() {
		String returnValue = "Answer True or False: " + text;
		System.out.println(returnValue);
	}
	
}
