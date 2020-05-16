package system;

public class Proficiency
{
  private String name;
  private String  type;
  private String  origin;

  public Proficiency(String name, String type, String origin)
  {
    this.name = name;
    this.type = type;
    this.origin = origin;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getType()
  {
    return type;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public String getOrigin()
  {
    return origin;
  }

  public void setOrigin(String origin)
  {
    this.origin = origin;
  }

  @Override public String toString()
  {
    return "Proficiency{" + "name='" + name + '\'' + ", type='" + type + '\''
        + ", origin='" + origin + '\'' + '}';
  }
}