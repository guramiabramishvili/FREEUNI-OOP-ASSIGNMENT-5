package Model;

import java.math.BigDecimal;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;



public class DBData {

    private final Connection conn;

    public DBData(){
        conn = DBConnection.getConnection();
    }


    public Item getSingleItem(String ID) throws SQLException{
        Item item = new Item();
        Statement stm =  conn.createStatement();
        ResultSet rs = stm.executeQuery("Select * from products where productid = \"" + ID + "\"");
        if (rs.next()) {
              item = new Item();
              item.id = (String) rs.getObject(1);
              item.name = (String) rs.getObject(2);
              item.image = (String) rs.getObject(3);
              item.price = (BigDecimal) rs.getObject(4);
        }
        return item;
    }

    public HashSet<Item> getItems(Set<String> IDs) throws SQLException{
        HashSet<Item> result = new HashSet<>();
        StringBuilder query = new StringBuilder();
        Statement stm = conn.createStatement();

        query.append("SELECT * FROM products ");
        if(IDs!=null) {
            query.append("WHERE productid IN ");
            String ids = "(";
            int k = 0;
            for(String id : IDs){
                if(IDs.size() == k+1){
                    ids+= "'" + id + "'";
                }
                else ids += "'" + id +"',";
                k++;
            }
            query.append(ids + ")");
        }

        ResultSet rs = stm.executeQuery(query.toString());

        while (rs.next()){

            Item item = new Item();
            item.id = (String) rs.getObject(1);
            item.name = (String) rs.getObject(2);
            item.image = (String) rs.getObject(3);
            item.price = (BigDecimal) rs.getObject(4);
            result.add(item);
        }
        return result;
    }

}
