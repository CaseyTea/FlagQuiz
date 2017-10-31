package edu.orangecoastcollege.cs273.flagquiz;


public class Country {

    private String mName;
    private String mRegion;
    private String mFileName;

    /**
     * Default constructor for a country used in the quiz
     * @param name the name of the country
     * @param region the region that the country is in
     */
    public Country(String name, String region) {
        mName = name;
        mRegion = region;
        name = name.replaceAll(" ", "_");
        region = region.replaceAll(" ", "_");
        mFileName = region + "/" + region + "-" + name + ".png";
    }

    /**
     * Returns the name of the country
     * @return the name of the country
     */
    public String getName() {
        return mName;
    }

    /**
     * Set the name of the country
     * @param name the name of the country
     */
    public void setName(String name) {
        mName = name;
    }

    /**
     * returns the region of the country
     * @return the region of the country
     */
    public String getRegion() {
        return mRegion;
    }

    /**
     * sets the region of the country
     * @param region the region of the country
     */
    public void setRegion(String region) {
        mRegion = region;
    }

    /**
     * returns the file name to load the flag
     * @return the file name of the country's flag
     */
    public String getFileName() {
        return mFileName;
    }

    /**
     * set the file name to load the country's flag
     * @param fileName the file name of the country's flag
     */
    public void setFileName(String fileName) {
        mFileName = fileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (!mName.equals(country.mName)) return false;
        if (!mRegion.equals(country.mRegion)) return false;
        return mFileName.equals(country.mFileName);

    }

    @Override
    public int hashCode() {
        int result = mName.hashCode();
        result = 31 * result + mRegion.hashCode();
        result = 31 * result + mFileName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Name='" + mName + '\'' +
                ", Region='" + mRegion + '\'' +
                ", FileName='" + mFileName + '\'' +
                '}';
    }
}
