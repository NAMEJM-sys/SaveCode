package CordingTest;

import java.util.ArrayList;
import java.util.List;

class StudentGrade{
    int language;
    int english;
    int mathematics;
    String name;
    int languageTotal;

    StudentGrade (String name, int language, int english, int mathematics){
        this.name = name;
        this.language = language;
        this.english = english;
        this.mathematics =mathematics;
    }

    public int StToGrade(){
        return language + english + mathematics;
    }
}

public class asd {
    public static void main(String[] args) {
        List<StudentGrade> StudentArray = new ArrayList<StudentGrade>( List.of(
                new StudentGrade("a1", 90, 95, 85),
                new StudentGrade("a2", 75, 80, 100),
                new StudentGrade("a3", 80, 70, 95),
                new StudentGrade("a4", 100, 65, 80),
                new StudentGrade("a5", 85, 60, 90)
        ));
        int languageTotal=0;
        int englishTotal=0;
        int mathematicsTotal=0;

        System.out.println("학생별 총점: ");
        for(int i=0; i<StudentArray.size(); i++){
            StudentGrade SG = StudentArray.get(i);
            System.out.printf("이름: %s 총점: %d%n",SG.name, SG.StToGrade());
            languageTotal += SG.language;
            englishTotal += SG.english;
            mathematicsTotal += SG.mathematics;
        }

        System.out.println("\n과목별 총점: ");
        System.out.printf("국어: %d%n",languageTotal);
        System.out.printf("영어: %d%n",englishTotal);
        System.out.printf("수학: %d%n",mathematicsTotal);

    }
}
