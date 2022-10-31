package OBSSystem;

public class Lecture {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int opininNote;

    Lecture(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.opininNote=0;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
        this.teacher=teacher;}
        else
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor");
    }


    void printTeacher(){
        this.teacher.print();
    }
}
