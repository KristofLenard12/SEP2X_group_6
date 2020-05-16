package system;

import java.util.ArrayList;

public class Ability
{
  private String name;
  private String description;
  private ArrayList<Proficiency> proficiencies;


  public Ability(String name, String description)
  {
    this.name = name;
    this.description = description;
    proficiencies = new ArrayList<>();
  }

  public String getName()
  {
    return name;
  }

  public void setProficiencies(ArrayList<Proficiency> prof)
  {
    proficiencies = prof;
  }
  public void addProficiency(Proficiency prof)
  {
    proficiencies.add(prof);
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  @Override public String toString()
  {
    return "Ability{" + "name='" + name + '\'' + ", description='" + description + "'}'";
  }
}
