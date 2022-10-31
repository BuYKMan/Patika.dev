public class Main {
    public static void main(String[] args) {
        BoksGame f1= new BoksGame("A",10,100,100,100);
        BoksGame f2= new BoksGame("B",20,70,85,50);

        Match match=new Match(f1,f2,80,195);
        match.run();
    }


}
