package OBSSystem;

public class Students {
   Lecture c1;
   Lecture c2;
   Lecture c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    public Students(Lecture c1, Lecture c2, Lecture c3, String name, String stuNo, String classes ) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.avarage = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int note1,int note2,int note3,int note4){
        if(note1<=100 &&note1>=0){
            this.c1.note=note1;
            this.c1.opininNote=note4;
        }
        if(note2<=100 &&note2>=0){
            this.c2.note=note2;
            this.c2.opininNote=note4;
        }
        if(note3<=100 &&note3>=0){
            this.c3.note=note3;
            this.c3.opininNote=note4;
        }

    }
    void isPass(){
        System.out.println("--------------------------------");
        this.avarage=(this.c1.note+this.c2.note+this.c3.note)/3.0*0.8;
        this.avarage+=(this.c1.opininNote+ this.c2.opininNote+ this.c3.opininNote)/3.0*0.2;
        if(this.avarage>55){
            System.out.println("Habam Sınıf Uyanıyor");
            this.isPass=true;
        }
        else{
            System.out.println("Hababam sınıfı sınıfta kaldı");
        this.isPass=false;
        }
        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name+"   Notu:\t"+this.c1.note+"   Kanaat: \t"+this.c1.opininNote);
        System.out.println(this.c2.name+"   Notu:\t"+this.c2.note+"   Kanaat: \t"+this.c2.opininNote);
        System.out.println(this.c3.name+"   Notu:\t"+this.c3.note+"   Kanaat: \t"+this.c3.opininNote);
        System.out.println("Ortalamanız:   "+this.avarage);
    }
}
