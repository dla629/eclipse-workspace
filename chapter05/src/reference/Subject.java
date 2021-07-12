package reference;

public class Subject {
	
	String subjectName;		//과목
	int scorePoint;			//과목의 점수
	
	public void setmath(String name, int score) {
		subjectName = name;
		scorePoint = score;
	}
	
	public void setKorea(String name ,int score) {
		subjectName = name;
		scorePoint = score;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}
	


}
