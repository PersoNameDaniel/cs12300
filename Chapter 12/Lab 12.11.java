public class StringInstrument extends Instrument {
    private int numOfStrings;
    private int numOfFrets;
    private boolean isBowed;

    public void setNumOfStrings(int userNumOfStrings) {
        numOfStrings = userNumOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfFrets(int userNumOfFrets) {
        numOfFrets = userNumOfFrets;
    }

    public int getNumOfFrets() {
        return numOfFrets;
    }

    public void setIsBowed(boolean userIsBowed) {
        isBowed = userIsBowed;
    }

    public boolean getIsBowed() {
        return isBowed;
    }

    /*public void printInfo() {
        super.printInfo();
        System.out.println("   Number of strings: " + numOfStrings);
        System.out.println("   Number of frets: " + numOfFrets);
        System.out.println("   Is bowed: " + isBowed);
    }*/
}