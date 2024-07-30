class Led {
    String type;
    int brightness; 
    String color;

    
    Led(String Type, int Brightness, String Color) {
        System.out.println("Created an LED");
        type = Type;
        brightness = Brightness;
        color = Color;
    }
}
