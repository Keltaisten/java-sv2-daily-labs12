package day04;

public class Block {
    private String nameOfTeacher;
    private String nameOfLecture;
    private String nameOfClass;
    private int lessonNumber;

    public Block(String nameOfTeacher, String nameOfLecture, String nameOfClass, int howManyTimesTeach) {
        this.nameOfTeacher = nameOfTeacher;
        this.nameOfLecture = nameOfLecture;
        this.nameOfClass = nameOfClass;
        this.lessonNumber = howManyTimesTeach;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public String getNameOfLecture() {
        return nameOfLecture;
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }
}
