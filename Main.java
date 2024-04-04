import java.util.*;

class Main {
  
  public static void main(String[] args) {

    ArrayList<String>vacationSpots = new ArrayList<>();
    vacationSpots.add("Hawaii");
    vacationSpots.add("Paris");
    vacationSpots.add("Tokyo");
    vacationSpots.add("London");

    System.out.println("Common world vacation spots:");
    for(String spot : vacationSpots){
      System.out.println(spot);
    }

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your favorite vacation spot:");
    String favoriteSpot = scanner.nextLine();

    System.out.print("Enter your least favorite vacation spot:");
    String leastFavoriteSpot = scanner.nextLine();

    vacationSpots.remove(favoriteSpot);
    vacationSpots.remove(leastFavoriteSpot);

    vacationSpots.add(0, favoriteSpot);

    System.out.println("\nRevised vacation spots list:");
    for(String spot : vacationSpots){
      System.out.println(spot);
    }}}