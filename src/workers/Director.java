package workers;

public class Director {    // implements Worker

  //  @Override
  //  public void work() {
   //     System.out.println("Я - директор!");
   // }

public void force (Worker worker){
    worker.work();
}

}
