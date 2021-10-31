package by.overone.lesson15;


import java.util.Locale;

public class HomeWork {
    private String str1, str2, str, surname, name, middleName;
    int count = 1;

    public HomeWork(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public HomeWork(String str) {
        this.str = str;
    }

    public HomeWork() {
    }

    public void concatOfString() {
        str1 = str1.concat(str2);
        System.out.println("Concatenated string: " + str1);
    }

    public StringBuilder stringBuilder(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        result.append(str1).append(str2);
        System.out.println(result);
        return result;
    }

    public void replaceChar() {
        str1 = str1.replace('(', ')');
        System.out.println("String with funny smileys: " + str1);
    }

    public boolean thirdEx(String string, String word) {
        System.out.println("String: " + string + "\nWord: " + word);
        string = string.toLowerCase();
        int position = string.length() - word.length();
        if (string.indexOf(word) == 0 && string.lastIndexOf(word) == position) {
            System.out.println("The line begins and ends with this word: " + word);
            return true;
        } else {
            System.out.println("Enter the other line");
            return false;
        }
    }

    public void initials(String surname, String name, String middleName) {
        surname = surname.toUpperCase();
        name = name.toUpperCase();
        middleName = middleName.toUpperCase();
        StringBuilder initials = new StringBuilder();
        initials.append(surname.charAt(0)).append(".").append(name.charAt(0)).append(".").append(middleName.charAt(0));
        System.out.println("Initials: " + initials);
    }

    public void countOfWords() {
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ' ') {
                count = count + 1;
                if (str.charAt(i + 1) == ' ') {
                    count = count - 1;
                }
            }
        System.out.println("Count of words: " + count);
    }

    public void replacingDuplicate() {
        int n = 1, i = 0;
        StringBuilder newString = new StringBuilder();
        newString.append(str.charAt(0));
        while (i < str.length() && n < str.length()) {
            if (str.charAt(i) != str.charAt(n)) {
                newString.append(str.charAt(n));
            }
            n++;
            i++;
        }

        System.out.println("The resulting string: " + newString);
    }

    public void seventh(String str) {
        char[] ch = new char[10];
        if (str.length() > 10) {
            int[] ch2={0,0,0,0,0,0,0,0,0,0};
            System.out.println("String size is more than 10 characters: ");
            for (int i=0; i<ch2.length; i++){
                System.out.print(ch2[i]);
            }

        } else {
            int destStartIndex = 10 - str.length();
            String str2 = new String("0000000000");

            str.getChars(0, str.length(), ch, destStartIndex);
            str2.getChars(0, destStartIndex, ch, 0);
            System.out.println("The resulting string: ");
            for (int i = 0; i < ch.length; i++) {
                System.out.print(ch[i] + " ");
            }
        }

    }
    public void seventh2(String str){
        StringBuffer string=new StringBuffer();
        string.append("0000000000");
        if (str.length() > 10) {
            System.out.println("\nString size is more than 10 characters: "+string);
            }else{

        int start=10-str.length();
        string.replace(start,string.length(),str);
        System.out.println("\nThe resulting string: "+string);
    }}


    @Override
    public String toString() {
        return "HomeWork{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }
}
