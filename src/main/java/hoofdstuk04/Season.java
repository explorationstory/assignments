package hoofdstuk04;

import java.util.Scanner;

public class Season {

    public static void main(String[] args) {
        Season season = new Season();

        System.out.println("Enter season to determine if it's hot or cold");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        season.determineSeason(input);

        scanner.close();
    }
    public String determineSeason(String season) {

        Seasons selectedSeason = convertToEnum(season);

        switch(selectedSeason) {
            case WINTER:
                System.out.println(Seasons.WINTER.hotOrCold);
                break;
            case FALL:
                System.out.println(Seasons.FALL.hotOrCold);
                break;
            case SPRING:
                System.out.println(Seasons.SPRING.hotOrCold);
                break;
            case SUMMER:
                System.out.println(Seasons.SUMMER.hotOrCold);
                break;
            default:
                System.out.println("Unknown");
        }
        return selectedSeason.hotOrCold;
    }

    public Seasons convertToEnum(String season) {

        Seasons seasonFromInput = Seasons.valueOf(season.toUpperCase());

        return seasonFromInput;
    }
}
