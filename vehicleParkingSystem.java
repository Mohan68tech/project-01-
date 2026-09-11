abstract class vehicle{
    private String vehiclenumber;
    private String ownername;
   
   public vehicle(String vehiclenumber, String ownername){
        this.vehiclenumber = vehiclenumber;
        this.ownername = ownername;
    }
 abstract void calculateParkingFee();

}


    class car extends vehicle{
        public car(String vehiclenumber, String ownername) {
            super(vehiclenumber, ownername);
        }
    

    void calculateParkingFee(){
        System.out.println("Parking fee for car is $50 per hour");
    }
    }

    class bike extends vehicle{
        public bike(String vehiclenumber, String ownername) {
            super(vehiclenumber, ownername);
        }
    

    void calculateParkingFee(){
        System.out.println("Parking fee for bike is $10 per hour");
    }
    }


    class truck extends vehicle{
        public truck(String vehiclenumber, String ownername) {
            super(vehiclenumber, ownername);
        }
    

    void calculateParkingFee(){
        System.out.println("Parking fee for truck is $100 per hour");
    }
    }


 class vehicleParkingSystem {
    public static void main(String[] args) {

        vehicle car = new car("MH20AJ6815", "Mohan");
    car.calculateParkingFee();

        vehicle bike = new bike("MH57MJ6815", "Sai");
        bike.calculateParkingFee();

        truck truck = new truck("Mh01AB6815", "Shree");
        truck.calculateParkingFee();
    }
}