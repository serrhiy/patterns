
public class Main {
  static public void main(String[] args) {
    final var truck = Truck.builder()
      .owner("Andrii")
      .stsNumber("123 321")
      .year(2024)
      .weight(2000)
      .power(600)
      .build();
    final var info = truck.getInfo();
    System.out.println(info);
  }
}

