package edu.cnm.deepdive.parser.model;


import com.google.gson.annotations.Expose;
import java.util.LinkedList;
import java.util.List;

public class PrimaryKey {

  @Expose
  private List<String> columnNames = new LinkedList<>();

  @Expose
  private boolean autoGenerate;

  public List<String> getColumnNames() {
    return columnNames;
  }

  public void setColumnNames(List<String> columnNames) {
    this.columnNames = columnNames;
  }

  public boolean isAutoGenerate() {
    return autoGenerate;
  }

  public void setAutoGenerate(boolean autoGenerate) {
    this.autoGenerate = autoGenerate;
  }
}
