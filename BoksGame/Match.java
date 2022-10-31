import java.awt.desktop.ScreenSleepEvent;

public class Match {
    BoksGame f1;
    BoksGame f2;
    int minWeight;
    int maxWeight;

     Match(BoksGame f1, BoksGame f2, int minWeight, int maxWeight) {
         int change= (int) Math.round(Math.random());
         if(change ==0){
             this.f1=f1;
             this.f2=f2;
         }
         if(change==1){
             this.f1=f2;
             this.f2=f1;
         }
         this.minWeight = minWeight;
         this.maxWeight = maxWeight;
    }
    public void run(){
         if(isCheck()){
             System.out.println("=========YENI ROUND==========");
             while(this.f1.health>0&&this.f2.health>0){
                 f2.health=f1.hit(f2);
                 if(isWin())
                     break;
                 f1.health=f2.hit(f1);
                 if(isWin())
                     break;
             }
             System.out.println(f1.name+"   "+f1.health);
             System.out.println(f2.name+"    "+f2.health);
         }
         else
             System.out.println("Sporcuların sikletleri uymuyor");
    }
    boolean isCheck(){
         return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight)&&(this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }
    boolean isWin(){
         if(this.f1.health==0){
             System.out.println(f2.name + "Kazanadı!!!");
             return true;
         }
         else if(this.f2.health==0){
             System.out.println(f2.name + "Kazanadı!!!");
             return true;
         }
         return  false;
    }
}
