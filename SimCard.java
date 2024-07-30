class SimCard {
    String provider;
    String type; 
    long number; 

    
    SimCard(String Provider, String Type, long Number) {
        System.out.println("Created a SIM Card");
        provider = Provider;
        type = Type;
        number = Number;
    }
}