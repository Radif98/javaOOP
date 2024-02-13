package exception.homeworks.controlwork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public Controller controller = new Controller(); //создаем объект контроллер для использования метода креатлист
    public void main(String[] args)
    {
        List<String> list = controller.creatList(); //сохраняем в пременную возращаемый массив методом
        for (int i = 0; i < 1; i++) { //цикл только для объявление имени файла
            String path = "R:\\JavaOOP\\src\\exception\\homeworks\\controlwork\\" + list.get(0); //путь к файлу
            try {
                File file = new File(path);
                if (file.createNewFile()) { //если создали файл следующие действия см.ниже
                    try {
                        FileWriter writer = new FileWriter(path);
                        for (int j = 0; j < list.size(); j++) {
                            writer.write("<" + list.get(j) + ">");
                        }
                        writer.close();
                    } catch (IOException e) { //обработка исключения
                        System.out.println("Ошибка при записи в файл");
                        e.printStackTrace();
                    }
                } else { //если файл уже существует, тогда действия см. ниже
                    try {
                        FileWriter writer = new FileWriter(path, true);
                        writer.write("\n");
                        for (int k = 0; k < list.size(); k++) {
                            writer.write("<" + list.get(k) + ">");
                        }
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("Ошибка при записи в файл");
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                System.out.println("Ошибка при создании файла");
                e.printStackTrace();
            }
        }
    }
}
