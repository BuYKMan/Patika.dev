package OBSSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1= new Teacher("Mahmut Hoca","TRH","095");
        Teacher t2= new Teacher("Graham Bell","FZK","000");
        Teacher t3= new Teacher("KülYutmaz","BIO","1111");

        Lecture tarih = new Lecture("Tarih" ,"101","TRH");
        tarih.addTeacher(t1);

        Lecture fizik=new Lecture("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Lecture biyo = new Lecture("Biyolaji","101","BIO");
        biyo.addTeacher(t3);

        Students s1=new Students(tarih,fizik,biyo,"Inek Saban","123","4");
        s1.addBulkExamNote(100,20,0,85);
        s1.isPass();

        Students s2= new Students(tarih,fizik,biyo,"Güdük Necmi","444","4");
        s2.addBulkExamNote(78,96,48,73);
        s2.isPass();
    }
}
