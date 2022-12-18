public class Main {
    public static void main(String[] args) {
        int sumAverage1 = 0;
        int sumAverage2 = 0;
        int min = 18;
        int max = 40;
        int[] firstTeam = new int[25];
        int[] ageTeam2= new int[25];

        for (int i=0; i < firstTeam.length;i++){
            firstTeam[i] = (int) (Math.random()*(40 - 18) + 18);
            ageTeam2[i] = (int) (Math.random()*(40 - 18) + 18);

            System.out.print(firstTeam[i]);
            System.out.println();
            sumAverage1 += firstTeam[i]; // тоже самое что sumAverage1 = sumAverage1 + firstTeam[i];
            sumAverage2 += ageTeam2[i];
        }

        double average1 = (double) sumAverage1 / firstTeam.length;
        double average2 = (double) sumAverage2 / firstTeam.length;
    }
}
