package edu.cnm.deepdive.parser.model;


import com.google.gson.annotations.Expose;
import java.util.LinkedList;
import java.util.List;

public class ForeignKey {

  @Expose
  private String table;

  @Expose
  private String onDelete;

  @Expose
  private String onUpdate;

  @Expose
  private List<String> columns = new LinkedList<>();

  @Expose
  private List<String> referencedColumns = new LinkedList<>();


  public String getTable() {
    return table;
  }

  public void setTable(String table) {
    this.table = table;
  }

  public String getOnDelete() {
    return onDelete;
  }

  public void setOnDelete(String onDelete) {
    this.onDelete = onDelete;
  }

  public String getOnUpdate() {
    return onUpdate;
  }

  public void setOnUpdate(String onUpdate) {
    this.onUpdate = onUpdate;
  }

  public List<String> getColumns() {
    return columns;
  }

  public void setColumns(List<String> columns) {
    this.columns = columns;
  }

  public List<String> getReferencedColumns() {
    return referencedColumns;
  }

  public void setReferencedColumns(List<String> referencedColumns) {
    this.referencedColumns = referencedColumns;
  }
}
