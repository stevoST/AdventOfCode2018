public class Day11PowerGrid {

    public static void main(String[] args) {

        int coordinateX = 1;
        int coordinateY = 1;
        int maxPowerCoordinateX = 0;
        int maxPowerCoordinateY = 0;
        int serialNumber = 6548;
        int maxGridSize = 0;

        coordinateX--;
        coordinateY--;

        int powerLevel;
        int maximumPower = -5000;
        int[][] powerGrid = new int[300][300];

        //generating power grid
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

        for(int gridSize = 0; gridSize < 300; gridSize++) {

            //loops for searching in whole power grid
            for (int x = 0; x < 300 - gridSize; x++) {
                for (int y = 0; y < 300 - gridSize; y++) {
                    int totalPower = 0;

                    // loops for evaluate matrix by coordinate and grid(matrix) size
                    for (int j = 0; j < gridSize; j++) {
//                    System.out.println("");
                        for (int i = 0; i < gridSize; i++) {
//                            if (x == coordinateX && y == coordinateY) {
//                                System.out.print(powerGrid[coordinateX + i][coordinateY + j] + " ");
//                            }
//                        System.out.print(powerGrid[x + i][y + j] + " ");
                            if (i == 0 && j == 0) {
                                totalPower = powerGrid[x + i][y + j];
                            }
                            totalPower += powerGrid[x + i][y + j];
                        }

//                        if (x == coordinateX && y == coordinateY) {
//                            System.out.println("");
//                        }
//                    System.out.println("");
                    }
//                System.out.println("-------");
//                System.out.println(totalPower);
//                System.out.println("-------");
                    if (totalPower > maximumPower) {
                        maximumPower = totalPower;
                        maxPowerCoordinateX = x + 1;
                        maxPowerCoordinateY = y + 1;
                        maxGridSize = gridSize;
                    }
//                System.out.println(totalPower);

                }
            }
        }
        System.out.println("Maximum Power is: " + maximumPower + " with coordinate X: " + maxPowerCoordinateX + " and cooridinate Y: " + maxPowerCoordinateY + " with Grid size: " + maxGridSize);
//        System.out.println("Check: "+(((((coordinateX+11)*(coordinateY+1))+serialInput)*(coordinateX+11))/100)%10);
    }
}
