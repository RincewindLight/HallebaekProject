/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import GatewayMapper.Facade;
import Resources.Packages;
import Resources.Product;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aaron, 19/04/2013
 */
public class PackageList {
    
    private ArrayList<Packages> packageList = new ArrayList();
    private Packages currentPackage;
    Facade facade = new Facade();
    
    public void addToPackageList(int packID, String packName, String packDesc, int packPrice){
        packageList.add(new Packages(packID, packName, packDesc, packPrice));
    }
    
    public Packages getCurrentPackage(int i){
            currentPackage = packageList.get(i);
            return currentPackage;
    }

    public int getPackageListSize() {
        return packageList.size();
    }
    
    public void clearPackageList(){
        packageList.clear();
    }

    //These are the getters
    public int getPackID(){
        return currentPackage.getPackageID();
    }
    public String getPackName(){
        return currentPackage.getName();
    }
    public String getPackDisc(){
        return currentPackage.getDescription();
    }
    public int getPackPrice(){
        return currentPackage.getPrice();
    }
    public Product getPackageProductList(int i){
        return currentPackage.packageProductList.get(i);
    }
    public int getPackageProductID(int i){
        return currentPackage.packageProductList.get(i).getProductID();
    }
    public String getPackageProductName(int i){
        return currentPackage.packageProductList.get(i).getName();
    }
    public int getPackageProductQTY(int i){
        return currentPackage.packageProductList.get(i).getQuantity();
    }
    
    //theses are the setter
    public void editPackName(String newName) {
        currentPackage.setName(newName);
    }
    public void editPackDisc(String newDesc) {
        currentPackage.setDescription(newDesc);
    }
    public void editPackPrice(int newPrice){
        currentPackage.setPrice(newPrice);
    }
    
    //communication to packageProductList
    public int getPackageProductListSize() {
        return currentPackage.packageProductList.size();
    }
    public boolean addItemToPackageList(int prodID, String name, int vol, int quantity, String descrip, int price) {
        return currentPackage.addItemToPackageList(prodID, name, vol, quantity, descrip, price);
    }
    public void removeFromPackageList(int index) {
        currentPackage.removeFromPackageList(index);
    } 
    public int searchPackProdByIDinArray(int ID){
        return currentPackage.searchPackProdByIDinArray(ID);
    }
    
   //communication to PackageGateway
    public boolean buildPackageList(PackageList packageList) {
        boolean success = false;
        if (facade.buildPackageList(packageList)){
            success = true;
        }
        else {
            JOptionPane.showMessageDialog(null, "Could not fetch packages!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean addPackage(String packName, String packDesc, int packPrice) {
        String empty = "";
        String tempPackPrice = "" + packPrice;
        boolean success = false;
        if (!packName.equals(empty) && !packDesc.equals(empty) && !tempPackPrice.equals(empty)) {
            if (facade.addPackage(packName, packDesc, packPrice)){
                JOptionPane.showMessageDialog(null, "Package Added to Database", "Success", JOptionPane.INFORMATION_MESSAGE);
                success = true;
            }else {
            JOptionPane.showMessageDialog(null, "Error Adding Package to Database", "Error", JOptionPane.ERROR_MESSAGE);
        }
        } 
        else {
            JOptionPane.showMessageDialog(null, "One or More Fields Are Empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    public boolean addProductsToPackageInDB(PackageList packageList) {
        if (facade.addProductsToPackageInDB(packageList)) {
            JOptionPane.showMessageDialog(null, "Product Added to PackageDatabase", "Success", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Error Adding Product to Package Database", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean loadPackageProducts(int packID, PackageList packageList) {
        boolean success = false;
        //getCurrentPackage(index);
        if (facade.loadPackageProducts(packID, packageList)) {
            JOptionPane.showMessageDialog(null, "Products loaded into Packages", "Success", JOptionPane.INFORMATION_MESSAGE);
            success = true;
        } else {
            if (currentPackage.packageProductList.isEmpty()){
            JOptionPane.showMessageDialog(null, "There are no products in this package Yet", "Infomation", JOptionPane.INFORMATION_MESSAGE);
            success = true;
            }
            else {
            JOptionPane.showMessageDialog(null, "Problem Loading package products from daterbase", "Error", JOptionPane.ERROR_MESSAGE);
            success = false;
            }
        }
        return success;
    }

    public boolean deletePackageProducts(int packID) {
        boolean success = false;
        if (facade.deletePackageProducts(packID)) {
            success  = true;
        }
        return success;
    }

    public boolean deletePackage(int packID) {
        boolean success = false;
        if (facade.deletePackage(packID)) {
            JOptionPane.showMessageDialog(null, "Package deleted from Database", "Success", JOptionPane.INFORMATION_MESSAGE);

           success = true;
        } else {
            JOptionPane.showMessageDialog(null, "Error deleting Package from Database", "Error", JOptionPane.ERROR_MESSAGE);
           
        }
        return success;
    }
    
    public int getNewPackageID(String packName, String packDis, int packPrice){
        System.out.println(packageList.toString());
        int packid = 0;
        for (int i = 0; i < packageList.size(); i++) {
            if(packageList.get(i).getName().equals(packName) && packageList.get(i).getDescription().equals(packDis)
                    && packageList.get(i).getPrice() == packPrice){
                packid = packageList.get(i).getPackageID();
            }
        }
        
        return packid;
    }

}
