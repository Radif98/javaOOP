package exception.homeworks.controlwork;

import java.util.ArrayList;
import java.util.List;

public class Model {
    protected List<String> listData;

    public Model()
    {
        this.listData = new ArrayList<>();
    }

    public List<String> getListData()
    {
        return listData;
    }

    public boolean isOnlyDigits(String text) {
        boolean flag = true;
        for(int i = 0; i < text.length(); i++) {
            if(!Character.isDigit(text.charAt(i))) {
                flag = false;
            }
        }
        return flag;
    }

    public void isOnlyChar(String text, String error) {
        String sub = "{}[]:;\"'?/><.,`~!@#$%^&*()_+-= ";
        for(char el: sub.toCharArray()) {
            for (char ch: text.toCharArray()) {
                if (ch == el) {
                    throw new RuntimeException(error);
                }
            }
        }
    }

    public void isOnlyCharBirthday(String text, String error) {
        String sub = "{}[]:;\"'?/><,`~!@#$%^&*()_+-= ";
        for(char el: sub.toCharArray()) {
            for (char ch: text.toCharArray()) {
                if (el == ch) {
                    throw new RuntimeException(error);
                }
            }
        }
    }

    public boolean isOnlyDigitBirthday(String text) {
        boolean flag = true;
        for(int i = 0; i < text.length(); i++) {
            if (i != 2 && i != 5) {
                if (!Character.isDigit(text.charAt(i))) {
                    flag = false;
                }
            }
        }
        return flag;
    }

}
