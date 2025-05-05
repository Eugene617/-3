
public class Main {
    public static void main(String[] args) {
        int[] cities = {50, 55, 57, 58, 60};
        int maxKm = 175;
        int bestSum = 0;
        for (int i = 0; i < cities.length; i++) {
            for (int j = i + 1; j < cities.length; j++) {
                for (int k = j + 1; k < cities.length; k++) {
                    int sum = cities[i] + cities[j] + cities[k];
                    if (sum <= maxKm && sum > bestSum) {
                        bestSum = sum;
                    }
                }
            }
        }
        System.out.println("Максимальное расстояние: " + bestSum);
    }
}