public class Day01FrequencyCounter {

    public static void main(String[] args){
        int finalFrequency = 0;
        String frequencyChanges = "-1, +1, -1";
        String frequencyChangesArray[] = frequencyChanges.split(",");

        for(int i=0; i<frequencyChangesArray.length;i++)
        {
            finalFrequency += Integer.parseInt(frequencyChangesArray[i].trim());
        }
        System.out.println(finalFrequency);
    }
}
