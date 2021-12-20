package Classes;

import java.sql.Time;

/**
 *
 * @author Hamna Rauf
 */
public class InventoryItem {
    private String member_id;
    private String name;
    private String itemName;
    private int quantity;
    private int useQuantity;
    private int available;
    private Time time;
    private Time returnedTime;
    private int damaged;
    private String sportName;

    public InventoryItem(String sportName, int quantity){
        this.sportName = sportName;
        this.quantity = quantity;
    }
    public InventoryItem(String member_id, String name, String itemName, int quantity, Time time) {
        this.setMember_id(member_id);
        this.setName(name);
        this.setItemName(itemName);
        this.setQuantity(quantity);
        this.setTime(time);
    }

    public InventoryItem(String member_id, String name, String itemName, int quantity, Time time, Time returnedTime, int damaged){
        this(member_id, name, itemName, quantity, time);
        this.returnedTime = returnedTime;
        this.damaged = damaged;
    }

    public InventoryItem(String itemName, int quantity, int useQuantity, int available) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.setUseQuantity(useQuantity);
        this.setAvailable(available);
    }

    public int getUseQuantity() {
        return useQuantity;
    }

    public void setUseQuantity(int useQuantity) {
        this.useQuantity = useQuantity;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }
    
    public Time getReturnedTime() {
        return returnedTime;
    }

    public void setReturnedTime(Time returnedTime) {
        this.returnedTime = returnedTime;
    }

    public int getDamaged() {
        return damaged;
    }

    public void setDamaged(int damaged) {
        this.damaged = damaged;
    }


    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

}
