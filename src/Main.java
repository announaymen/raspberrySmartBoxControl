import com.pi4j.io.gpio.*;
public class Main {
    public static void main(String[] args) {
        try {
            final GpioController gpio = GpioFactory.getInstance();
            final GpioPinDigitalOutput pin =gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00,PinState.LOW);
         //   pin.blink(1000, 15000);
            openBox(pin);
        }
        catch (Exception e) {
        }
    }
public static void openBox(GpioPinDigitalOutput box){
        box.high();
}
}