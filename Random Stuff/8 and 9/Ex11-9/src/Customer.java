public class Customer {
    //three-digit ID number, six-character last name, and five-digit zip code for each customer
    int zipCode, ID;
    String lastName;

    public Customer(int ID, String lastName, int zipCode) {
        this.ID = ID;
        this.zipCode = zipCode;
        this.lastName = lastName;
    }

    public Customer() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("%03d %6.6s %s",ID,lastName,zipCode);
    }
}