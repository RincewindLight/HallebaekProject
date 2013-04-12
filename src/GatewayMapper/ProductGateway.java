package GatewayMapper;

import Resources.Product;
import DBConnection.ConnectionTools;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Adrian & Kris
 */
public class ProductGateway {

    ArrayList<Product> products;

    public ProductGateway() {
        products = new ArrayList<>();
            }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getProductListsize() {
        return products.size();
    }
    /*
     * Methods for searching through and displaying all or  products
     * Not using DB connection.
     */
    public Product searchProdByID(int ID) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductID() == ID) {
                return products.get(i);
            }
        }
        return null;
    }

    public Product searchProdByName(String name) {
        String found = "not found";
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                found = "found";
                return products.get(i);
            }
        }
        System.out.println(found);
        return null;
    }

    public Product showProducts(int index) {
        if (index < products.size()) {
            return products.get(index);
        } else {
            return null;
        }
    }
    public Product getProduct(int ID) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductID() == ID) {
                return products.get(i);
            }
        }
        return null;
    }
    
    /*
     * US 2.1
     * Admin can add product to
     * product table.
     */
    public boolean addProduct(String name, int volume, int quantity, String description, int price) {
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "INSERT into products "
                + "VALUES (productseq.nextval,?,?,?,?,?)";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setString(1, name);
            statement.setInt(2, volume);
            statement.setInt(3, quantity);
            statement.setString(4, description);
            statement.setInt(5, price);
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
    }
    
    /*
     * US 2.2
     * Admin can edit product in 
     * product table.
     */
    public boolean editProduct(int ID, String name, int volume, int quantity, String description, int price) {
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString2 = "SELECT * "
                + "FROM products "
                + "WHERE productID = ? "
                + "for update NOWAIT";

        String SQLString1 = "UPDATE products "
                + "SET pname = ?, "
                + "pvolume = ?, "
                + "pquantity = ?, "
                + "pdescription = ?, "
                + "pprice = ? "
                + "WHERE productID = ?";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString2);
            statement.setInt(1, ID);
            if (statement.execute()) {
                statement = con.prepareStatement(SQLString1);
                statement.setString(1, name);
                statement.setInt(2, volume);
                statement.setInt(3, quantity);
                statement.setString(4, description);
                statement.setInt(5, price);
                statement.setInt(6, ID);
                statement.executeUpdate();
                success = true;
            }
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
    }
    
    /*
     * US 2.3
     * Admin can delete product from
     * product table
     */
    public boolean deleteProduct(int ID) {
        boolean success = false;
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        String SQLString1 = "DELETE from products "
                + "WHERE productID = ? ";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setInt(1, ID);
            statement.executeUpdate();
            success = true;
        } catch (Exception e) {
            System.out.println("Error in deleting!");
            System.out.println(e.getMessage());
        }
        return success;
    }
    
    /*
     * US 1.2
     * Admin can search for a specic
     * product within the product table
     * by name or item number.
     */
    public boolean searchForProduct(String name) {
        products.clear();
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        boolean success = false;
        String SQLString1 = "SELECT * "
                + "FROM products "
                + "WHERE pname = ? ";

        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString1);
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                products.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6)));
            }
            success = true;
        } catch (Exception e) {
            System.out.println("Retrieval error!");
            System.out.println(e.getMessage());
            success = false;
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statement close error!");
                System.out.println(e.getMessage());
            }
        }
        return success;
    }

    public boolean searchForProduct(int ID) {
        products.clear();
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        boolean success = false;
        String SQLString2 = "SELECT * "
                + "FROM products "
                + "WHERE productid = ? ";
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLString2);
            statement.setInt(1, ID);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                products.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6)));
            }
            success = true;
        } catch (Exception e) {
            System.out.println("Retrieval error!");
            System.out.println(e.getMessage());
            success = false;
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statement close error!");
                System.out.println(e.getMessage());
            }
        }
        return success;
    }

    /*
     * US 1.1
     * Admin can access a inventory list
     * of all items within the Product
     * table.
     */
    public boolean getAllProducts() {
        products.clear();
        Connection con = ConnectionTools.getInstance().getCurrentConnection();
        boolean success = false;
        String SQLstring = "SELECT * "
                + "FROM products";

        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(SQLstring);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                products.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6)));
            }
            success = true;
        } catch (Exception e) {
            System.out.println("Retrieval error!");
            System.out.println(e.getMessage());
            success = false;
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Statement close error!");
                System.out.println(e.getMessage());
            }
        }
        return success;
    }
    
    /*Fetches a unique indentifier for each product.*/
    public int getUniqueProductId(){
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
    }
}
