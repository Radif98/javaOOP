package homeworks.task5;

public abstract class Participant {
    public Integer id;
    public String name;
    public String lastName;

    public Participant(Integer id, String name, String lastName)
    {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }
}
