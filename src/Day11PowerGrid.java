public class Day11PowerGrid {

    public static void main(String[] args) {

        int coordinateX = 21;
        int coordinateY = 61;
        int serialNumber = 42;
        coordinateX--;
        coordinateY--;

        int powerLevel = 0;
        int totalPower = 0;
        int maximumPower = 0;
        int[][] powerGrid = new int[300][300];

        for (int i = 0; i < 300; i++) {
            for (int j = 0; j < 300; j++) {
                int rackID;
                rackID = i + 11;
                powerLevel = rackID * (j + 1);
                powerLevel += serialNumber;
                powerLevel = powerLevel * rackID;
                powerLevel = (powerLevel / 100) % 10;
//                if(i==2 && j==4){System.out.println(powerLevel);}
                powerGrid[i][j] = powerLevel - 5;

            }
        }

        for (int x = 0; x < 297; x++) {
            for (int y = 0; y < 297; y++) {

                for (int j = 0; j < 3; j++) {
                    System.out.println("");
                    for (int i = 0; i < 3; i++) {
//                        if(x==299 && y==299){System.out.println(powerGrid[coordinateX + i][coordinateY + j]);}
                        System.out.print(powerGrid[x + i][y + j] + " ");
                        totalPower += powerGrid[x + i][y + j];
                    }

                    System.out.println("");
                }
                System.out.print("-------");
                if (totalPower > maximumPower) {
                    maximumPower = totalPower;
                }
//                System.out.println(totalPower);

            }
        }
        System.out.println("Maximum Power is: " + maximumPower);
//        System.out.println("Check: "+(((((coordinateX+11)*(coordinateY+1))+serialInput)*(coordinateX+11))/100)%10);
    }
}
