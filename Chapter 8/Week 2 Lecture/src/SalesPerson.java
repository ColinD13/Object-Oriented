public class SalesPerson {
    private int idNum;
    private double sales;

    public SalesPerson(int idNum, double sales)
    {
        this.idNum = idNum;
        this.sales = sales;
    }

    public SalesPerson()
    {
        this.idNum = 0000;
        this.sales = 0;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
    public String toString(){
        return ("ID Num:" + idNum+ " Sales: "+ sales);
    }
}
