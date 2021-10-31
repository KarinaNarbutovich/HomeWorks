package by.overone.lesson15;

public class TrainingGroup {
    public static void main(String[] args) {
        String str1 = "Я изучаю Java";
        HomeWork first = new HomeWork(str1, " и английский тоже надо :( :(" + "\n");
        System.out.println(first);
        first.concatOfString();
        StringBuilder stringBuilder1 = first.stringBuilder("Strings concatenated with StringBuilder: Я изучаю Java", " и английский тоже надо");
        first.replaceChar();
        HomeWork third = new HomeWork();
        System.out.println(third.thirdEx("Day after day", "day"));
        System.out.println(third.thirdEx("over and over again", "over"));
        HomeWork fourth = new HomeWork();
        fourth.initials("narbutovich", "Karina", "Petrovna");
        HomeWork fifth = new HomeWork("Strings  concatenated with  StringBuilder: Я изучаю Java");
        fifth.countOfWords();
        HomeWork sixth = new HomeWork("abbbbcccccccddef");
        sixth.replacingDuplicate();
        HomeWork seven=new HomeWork();
        seven.seventh("923456");
        seven.seventh2("32898967540");

    }
}


