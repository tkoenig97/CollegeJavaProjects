import javax.swing.JOptionPane;
public class ComputeSales {
    public static void main(String[] args) {

        Account[] acctLists = new Account[2];

        //get Supplies class information
        JOptionPane.showMessageDialog(null, "Creating Supplies Object");
        String ID_s = JOptionPane.showInputDialog("Enter ID Number");
        int ID = Integer.parseInt(ID_s);
        String Quantity_s = JOptionPane.showInputDialog("Enter Quantity");
        int Quantity = Integer.parseInt(Quantity_s);
        String Price_s = JOptionPane.showInputDialog("Enter Price");
        double Price = Double.parseDouble(Price_s);
        acctLists[0] = new Supplies(Quantity, Price, ID);

        //get Services class information
        JOptionPane.showMessageDialog(null, "Creating Services Object");
        ID_s = JOptionPane.showInputDialog("Enter ID number");
        ID = Integer.parseInt(ID_s);
        String Hours_s = JOptionPane.showInputDialog("Enter Hours Worked");
        int Hours = Integer.parseInt(Hours_s);
        String Rate_s = JOptionPane.showInputDialog("Enter Hourly Rate");
        double Rate = Double.parseDouble(Rate_s);
        acctLists[1] = new Services(Hours, Rate, ID);

        for (Account tmp: acctLists) {
            String displayInfo = tmp.toString();
            JOptionPane.showMessageDialog(null, displayInfo, "Display Message",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    } //main
} //class
