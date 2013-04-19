package GatewayMapper;

import DBConnection.ConnectionTools;
import Domain.OrderList;
import Resources.Order;
import Resources.Product;
import Resources.Truck;
import Resources.TruckOrder;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Adrian & Kris
 */
public class OrderGateway {
    OrderList orderlist;
        
    public boolean buildOrderList(OrderList orderlist) {
        this.orderlist = orderlist;
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT * "
                + "FROM orders";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                orderlist.addToOrderList(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6));
            }
            success = true;
        } catch (Exception e) {
            System.out.println("Error in getting list of orders.");
            System.out.println(e.getMessage());
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statement close error!");
                System.out.println(e.getMessage());
            }
        }
        return success;
    }//end of build order
    
    public boolean addOrder() {
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT into order_product "
                + "VALUES (orderseq.currval,?,?)";
        PreparedStatement statement = null;
        for (int i = 0; i < orderlist.getOrderListSize(); i++) {
            try {
                statement = con.prepareStatement(SQLString1);
                statement.setInt(1, orderlist.getProductList(i).getProductID());
                statement.setInt(2, orderlist.getProductList(i).getQuantity());
                statement.executeUpdate();
                success = true;
            } catch (Exception e) {
                System.out.println("products Insertion error!");
                System.out.println(e.getMessage());

            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.out.println("Statement close error!");
                    System.out.println(e.getMessage());
                }
            }
        }
        return success;
    }//end of add order
    
    public boolean addCustomerOrder(int orderID, int customerID, String startDate, String finishDate) {
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT into Customer_Order "
                + "VALUES (?,?,?,?)";

        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, orderID);
            statement.setInt(2, customerID);
            statement.setDate(3, Date.valueOf(startDate));
            statement.setDate(4, Date.valueOf(finishDate));
            statement.executeUpdate();
            success = true;
        } catch (Exception e) {
            System.out.println("Insertion error!");
            System.out.println(e.getMessage());
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statement close error!");
                System.out.println(e.getMessage());
            }
        }

        return success;
    }//end of add customer order

    /*
     * Fetches a unique identifier for each order.
     */
    public int getUniqueOrderID() {
        int temp = 0;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "SELECT orderseq.nextval "
                + "FROM dual";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                temp = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println("Something wrong build" + e.getMessage());

        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statment close error\n" + e.getMessage());
            }
        }

        return temp;

    }//end of get unique identifier
    
}// END
