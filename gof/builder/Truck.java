
public class Truck {
  private final String owner;
  private final String stsNumber;
  private final int year;
  private final String trailer;
  private final int weight;
  private final int power;
  private final int mileage;

  public Truck(String owner, String stsNumber, int year, String trailer, int weight, int power, int mileage) {
    this.owner = owner;
    this.stsNumber = stsNumber;
    this.year = year;
    this.trailer = trailer;
    this.weight = weight;
    this.power = power;
    this.mileage = mileage;
  }

  public String getInfo() {
    final var template = (
      "Owner: %s, STS Number: %s, Year: %d, Trailer: %s, " +
      "Weight: %d, Power: %d, Mileage: %d"
    );
    return String.format(template, owner, stsNumber, year, trailer, weight, power, mileage);
  }

  public static TruckBuilder builder() {
    return new TruckBuilder();
  }

  public static class TruckBuilder {
    private String owner;
    private String stsNumber;
    private int year;
    private String trailer;
    private int weight;
    private int power;
    private int mileage;
    
    public TruckBuilder owner(String owner) {
      this.owner = owner;
      return this;
    }

    public TruckBuilder stsNumber(String stsNumber) {
      this.stsNumber = stsNumber;
      return this;
    }

    public TruckBuilder year(int year) {
      this.year = year;
      return this;
    }

    public TruckBuilder trailer(String trailer) {
      this.trailer = trailer;
      return this;
    }

    public TruckBuilder weight(int weight) {
      this.weight = weight;
      return this;
    }

    public TruckBuilder power(int power) {
      this.power = power;
      return this;
    }

    public TruckBuilder mileage(int mileage) {
      this.mileage = mileage;
      return this;
    }

    public Truck build() {
      return new Truck(owner, stsNumber, year, trailer, weight, power, mileage);
    }
  }
}
