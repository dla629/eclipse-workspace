package reference;

public class Subject {
	
	String subjectName;		//����
	int scorePoint;			//������ ����
	
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
