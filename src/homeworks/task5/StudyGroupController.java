package homeworks.task5;

public class StudyGroupController {
    private StudyGroupServis studyGroupServis;
    private StudyGroupView studyGroupView;

    //типа данные из файла
    Teacher teacher = new Teacher(0, "Ivan", "Bulikov");
    Student student1 = new Student(1, "Igor", "Antonov");
    Student student2 = new Student(2, "Sergey", "Kolesnikov");
    Student student3 = new Student(3, "Nasty", "Dubova");
    Student student4 = new Student(4, "Lolita", "Karieva");
    Student student5 = new Student(5, "Vova", "Police");


    public StudyGroupController(StudyGroupServis studyGroupServis, StudyGroupView studyGroupView)
    {
        this.studyGroupServis = studyGroupServis;
        this.studyGroupView = studyGroupView;
    }

    public void startStudyGroup() {
        teacher.generateParticipant();
        student1.generateParticipant();
        student2.generateParticipant();
        student3.generateParticipant();
        student4.generateParticipant();
        student5.generateParticipant();
        boolean flag = false;
        do {
            String choise = studyGroupView.getUserChoice();
            switch (choise) {
                case "+":
                    boolean flagDown = false;
                    do {
                        studyGroupServis.generateStudyGroup(teacher, student1, student2, student3, student4, student5);
                        String pointer = studyGroupView.getUserInput("Введите какая информация вам нужна по студенческой группе \n");
                        switch (pointer) {
                            case "*":
                                studyGroupServis.getInfoListStudyGroup();
                                break;
                            case "-":
                                flagDown = true;
                                break;
                            case "0":
                                teacher.infoTeacher();
                                break;
                            case "1":
                                student1.infoStudent();
                                break;
                            case "2":
                                student2.infoStudent();
                                break;
                            case "3":
                                student3.infoStudent();
                                break;
                            case "4":
                                student4.infoStudent();
                                break;
                            case "5":
                                student5.infoStudent();
                                break;
                            default:
                                System.out.println("Упс, будьте внимательнее, вводите только то, что предлагают(Да, я грубый)");
                        }
                    } while(!flagDown);
                    break;
                case "-":
                    flag = true;
                    break;
            }
        } while (!flag);
    }
}
