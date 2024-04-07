package hotelreservationsystem;

class rooms {
    
    private int roomNo;
    private String type;
    private int capacity;
    private double price;
    private boolean available;
    
    rooms(int roomNo,String type,int capacity,double price,boolean available){
        this.roomNo = roomNo;
        this.type = type;
        this.capacity = capacity;
        this.price = price;
        this.available = available;
    }
    
    public int getRoomNo(){
        return roomNo;
    }
    
    public String getType(){
        return type;
    }
    
    public int getCapacity(){
        return capacity;
    }  
    
    public double getPrice(){
        return price;
    }
    
    public boolean isAvailable(){
        return available;
    }
    
    public void setAvailable(boolean available){
        available = this.available;
    }
    
    @Override
    public String toString(){
        return getRoomNo() + "\t\t" +getType()+"\t\t"+getCapacity()+"\t\t"+getPrice();
    }
}
