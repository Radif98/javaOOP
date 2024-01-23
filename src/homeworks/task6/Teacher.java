package homeworks.task6;

import java.util.ArrayList;
import java.util.List;

public abstract class Teacher {
    /**
     * учитель имеет имя и фамилию,
     * по этому ипсользуем список
     */
    protected List teacher;

    public Teacher()
    {
        this.teacher = new ArrayList<String>();
    }
}
