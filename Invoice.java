package Chapter3;

public class Invoice {

    String number;
    String description;
    int itemQuantity;
    double price;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        if (itemQuantity < 0)
            System.out.println("Invalid input");
        else
            this.itemQuantity = itemQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0)
            System.out.println("Invalid input");
        else
            this.price = price;
    }

    public Invoice(String number, String description, int itemQuantity, double price){
        this.number = number;
        this.description = description;
        this.itemQuantity = itemQuantity;
        this.price = price;
    }
    public double getInvoiceAmount(){
        double invoiceAmount;
        invoiceAmount = itemQuantity * price;
        return invoiceAmount;
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("", "",0 ,0);

        invoice.setNumber("96280");
        invoice.setDescription("This is the car engine number");
        invoice.setItemQuantity(2);
        invoice.setPrice(-2);

        System.out.println("Part number is: " + invoice.getNumber() + "\nDescription of part is: " +
                invoice.getDescription() + "\nItem Quantity to be purchased is: " + invoice.getItemQuantity() +
                "\nPrice of per item is: " + invoice.getPrice() + "\nTotal price is: " + invoice.getInvoiceAmount());
    }
}
