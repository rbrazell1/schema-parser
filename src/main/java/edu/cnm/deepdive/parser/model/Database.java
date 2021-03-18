package edu.cnm.deepdive.parser.model;


import com.google.gson.annotations.Expose;
import java.util.List;
import java.util.stream.Stream;

public class Database {

  @Expose
  private int version;

  @Expose
  private String identityHash;

  @Expose
  private List<Entity> entities;

  @Expose
  private List<View> views;

  @Expose
  private List<String> setupQueries;

  public int getVersion() {
    return version;
  }

  public void setVersion(int version) {
    this.version = version;
  }

  public String getIdentityHash() {
    return identityHash;
  }

  public void setIdentityHash(String identityHash) {
    this.identityHash = identityHash;
  }

  public List<Entity> getEntities() {
    return entities;
  }

  public void setEntities(List<Entity> entities) {
    this.entities = entities;
  }

  public List<View> getViews() {
    return views;
  }

  public void setViews(List<View> views) {
    this.views = views;
  }

  public List<String> getSetupQueries() {
    return setupQueries;
  }

  public void setSetupQueries(List<String> setupQueries) {
    this.setupQueries = setupQueries;
  }

  public Stream<String> ddlStream() {
    return Stream
        .concat(
            entities
                .stream()
                .flatMap(Entity::ddlStream),
            views
                .stream()
                .map(View::toDdl)
        );
  }
}
