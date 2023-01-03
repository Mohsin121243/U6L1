public class Keyboard {
    private int[] heights;
    private String[] alphabeticalNames;


    public Keyboard() {
        heights = new int[3];
        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;
        alphabeticalNames = new String[4];
        alphabeticalNames[0] = "Abby";
        alphabeticalNames[1] = "David";
        alphabeticalNames[2] = "Charlie";
        alphabeticalNames[3] = "Lauren";

        String temp = alphabeticalNames[1].toString();
        alphabeticalNames[1] = alphabeticalNames[2];
        alphabeticalNames[2] = temp;


    }

}
