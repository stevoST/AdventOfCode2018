public class Day11PowerGrid {

    public static void main(String[] args) {

        int coordinateX = 3;
        int coordinateY = 5;
        coordinateX--;
        coordinateY--;

        int serialInput = 4;
        int[][] powerGrid = new int[300][300];

                int powerLevel;

        for(int i=0;i<300;i++){
            for(int j=0;j<300;j++) {
                int rackID;
                rackID = i + 11;
                System.out.println(powerLevel);
                powerLevel = rackID*(j+1);
                System.out.println(powerLevel);
                powerLevel += serialInput;
                System.out.println(powerLevel);
                powerLevel = powerLevel*rackID;
                System.out.println(powerLevel);
                powerLevel = (powerLevel/100)%10;
                System.out.println(powerLevel);
                powerGrid[i][j] = powerLevel-5;

            }
        }
        System.out.println(powerGrid[coordinateX][coordinateY]);
//        System.out.println("Check: "+(((((coordinateX+11)*(coordinateY+1))+serialInput)*(coordinateX+11))/100)%10);
    }
}
