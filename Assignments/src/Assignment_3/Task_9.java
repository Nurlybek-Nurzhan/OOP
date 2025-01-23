package Assignment_3;

public class Task_9 {

  interface CanMove {
    Double speed();
  }

  interface CanFly extends CanMove {
    Double speed(CanFly fly);
  }
}
