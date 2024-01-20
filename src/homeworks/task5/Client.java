package homeworks.task5;

public class Client {
    public static void main(String[] args)
    {
        StudyGroupServis studyGroupServis = new StudyGroupServis();
        StudyGroupView studyGroupView = new StudyGroupView();
        StudyGroupController studyGroupController = new StudyGroupController(studyGroupServis, studyGroupView);
        studyGroupController.startStudyGroup();
    }
}
