package edu.cnm.deepdive.parser.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class View {

  private static final String PLACEHOLDER = "${VIEW_NAME}";

  @Expose
  private String viewName;

  @Expose
  @SerializedName("createSql")
  private String sqlStatement;

  public String getViewName() {
    return viewName;
  }

  public void setViewName(String viewName) {
    this.viewName = viewName;
  }

  public String getSqlStatement() {
    return sqlStatement;
  }

  public void setSqlStatement(String sqlStatement) {
    this.sqlStatement = sqlStatement;
  }

  public String toDdl() {
    return sqlStatement.replace(PLACEHOLDER, viewName);
  }

}
