package Model;

import java.util.*;

public class Cart {
    private HashMap<String,Integer> shopCart;

    public Cart(){
        shopCart = new HashMap<>();
    }

    public void addItem(String prodID, int quantity) {
        if(shopCart.get(prodID) != null) {
            shopCart.put(prodID, shopCart.get(prodID) + quantity);
        }else{
            shopCart.put(prodID,quantity);
        }
    }

    public int getCount(String itemID) {
        return shopCart.get(itemID);
    }

    public Set<String> getItemIDs(){
        return shopCart.keySet();
    }

    public void addProduct(String itemID, String quantity) {
        int itemNum;
        itemNum = Integer.parseInt(quantity);
        if(itemNum <= 0){
            return;
        }else{
            addItem(itemID,itemNum);
        }
    }
}
