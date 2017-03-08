package ldsbc.springboot.form;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Post {
	
	private String result;

	String textIn = "Fuzzy Wuzzy was a bear, \n" +
      "Fuzzy Wuzzy had no hair,\n" +
      "Fuzzy Wuzzy wasn't fuzzy,\n" +
      "was he?";
  
  public String getResult() {
    return result;
  }
  
  public void setResult(String result) {
    this.result = result;
  }
  
  public String getTextIn() {
    return textIn;
  }
  
  public void setTextIn(String textIn) {
    this.textIn = textIn;
  }
}
