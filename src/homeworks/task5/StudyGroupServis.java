package homeworks.task5;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupServis<T> {
    public List listStudyGroup = new ArrayList();

    public List generateStudyGroup(Teacher teacher, Student study1, Student study2, Student study3, Student study4, Student study5) {
        listStudyGroup.add(teacher);
        listStudyGroup.add(study1);
        listStudyGroup.add(study2);
        listStudyGroup.add(study3);
        listStudyGroup.add(study4);
        listStudyGroup.add(study5);
        return listStudyGroup;
    }

    public void getInfoListStudyGroup() {
        int count = 1;
        for (Object participant: listStudyGroup) {
            System.out.println(count + " - " + participant.toString());
            count++;
        }
    }
}
