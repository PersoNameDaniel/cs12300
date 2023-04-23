public class Encyclopedia extends Book {
    private String edition;
    private int numPages;

    public void setEdition(String userEdition) {
        edition = userEdition;
    }

    public String getEdition() {
        return edition;
    }

    public void setNumPages(int userNumPages) {
        numPages = userNumPages;
    }

    public int getNumPages() {
        return numPages;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("   Edition: " + edition);
        System.out.println("   Number of Pages: " + numPages);
    }
}