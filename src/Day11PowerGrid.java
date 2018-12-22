public class Day11PowerGrid {

    public static void main(String[] args) {

        int coordinateX=21;
        int coordinateY=53;
        int maxPowerCoordinateX = 0;
        int maxPowerCoordinateY = 0;
        int serialNumber = 6548;

        coordinateX--;
        coordinateY--;

        int powerLevel = 0;
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
                int totalPower = 0;

                for (int j = 0; j < 3; j++) {
//                    System.out.println("");
                    for (int i = 0; i < 3; i++) {
                        if(x==coordinateX && y==coordinateY){System.out.print(powerGrid[coordinateX + i][coordinateY + j]+" ");}
//                        System.out.print(powerGrid[x + i][y + j] + " ");
                        totalPower += powerGrid[x + i][y + j];
                    }

                    if(x==coordinateX && y==coordinateY){System.out.println("");}
//                    System.out.println("");
                }
//                System.out.println("-------");
//                System.out.println(totalPower);
//                System.out.println("-------");
                if (totalPower > maximumPower) {
                    maximumPower = totalPower;
                    maxPowerCoordinateX = x+1;
                    maxPowerCoordinateY = y+1;
                }
//                System.out.println(totalPower);

            }
        }
        System.out.println("Maximum Power is: " + maximumPower + " with coordinate X: " + maxPowerCoordinateX + " and cooridinate Y: " + maxPowerCoordinateY);
//        System.out.println("Check: "+(((((coordinateX+11)*(coordinateY+1))+serialInput)*(coordinateX+11))/100)%10);
    }
}
