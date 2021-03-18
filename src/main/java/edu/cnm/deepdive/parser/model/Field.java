package edu.cnm.deepdive.parser.model;


import com.google.gson.annotations.Expose;

public class Field {

  @Expose
  private String fieldPath;

  @Expose
  private String columnName;

  @Expose
  private String affinity;

  @Expose
  private boolean notNull;

  public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public String getAffinity() {
    return affinity;
  }

  public void setAffinity(String affinity) {
    this.affinity = affinity;
  }

  public boolean isNotNull() {
    return notNull;
  }

  public void setNotNull(boolean notNull) {
    this.notNull = notNull;
  }
}
