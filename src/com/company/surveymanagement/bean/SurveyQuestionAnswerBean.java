/**
 * 
 */
package com.company.surveymanagement.bean;

/**
 * @author trgl1
 *
 */
public class SurveyQuestionAnswerBean {

	private int surveyId;
	public int getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	private int questionId;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	
	/**
	 * 
	 */
	public SurveyQuestionAnswerBean() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "SurveyQuestionAnswerBean [questionId=" + questionId
				+ ", question=" + question + ", option1=" + option1
				+ ", option2=" + option2 + ", option3=" + option3
				+ ", option4=" + option4 + "]";
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public SurveyQuestionAnswerBean(int questionId, String question,
			String option1, String option2, String option3, String option4) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
	}
	
	
	
}
