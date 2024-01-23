package seminars.seminar06.task1;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> entris;

    public Journal()
    {
        this.entris = new ArrayList<>();
    }

    public List<String> getEntrise()
    {
        return entris;
    }

    void addEntry(String element)
    {
        entris.add(element);
    }

    void removeEntry(String element) {
        entris.remove(element);
    }
}
