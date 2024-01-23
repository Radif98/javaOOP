package homeworks.task6;

public class TeacherServis extends Teacher implements IPrint {
    public String name;// имя учителя
    public String lastName;// фамилия учителя

    /**
     * тут предельно ясно, геторы и сеторы
     */
    public String getName()
    {
        return name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * инициализируем сущность учитель
     */
    protected void initTeacher()
    {
        super.teacher.add(name);
        super.teacher.add(lastName);
    }

    @Override
    public void printTeacher()
    {
        String joined = String.join("|", super.teacher);
        System.out.println(joined);
    }
}
