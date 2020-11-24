import impl.AddressResolver;
import impl.RecursionCounter;
import impl.TrafficLight;
import interfaces.Counter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// First task
        System.out.println("Please, enter value: ");
        int countFrom = scanner.nextInt();
        Counter counter = new RecursionCounter();
        counter.count(countFrom);

// Second task
        String testAddress1 = "555 Straight Stave Ave, San Francisco, CA 94104";
        String testAddress2 = "444 Ave Maria Stairway St., San Francisco, CA 94104";
        String testAddress3 = "9032 Flave Steep Str, San Francisco, CA 94104";
        AddressResolver addressResolver = new AddressResolver();
        System.out.println(addressResolver.fixAddressWithRegExp(testAddress1));
        System.out.println(addressResolver.fixAddressWithRegExp(testAddress2));
        System.out.println(addressResolver.fixAddressWithRegExp(testAddress3));

        String testAddress4 = "555 Straight Stave Ave, San Francisco, CA 94104";
        String testAddress5 = "444 Ave Maria Stairway St., San Francisco, CA 94104";
        String testAddress6 = "9032 Flave Steep Str, San Francisco, CA 94104";
        System.out.println(addressResolver.fixAddress(testAddress4));
        System.out.println(addressResolver.fixAddress(testAddress5));
        System.out.println(addressResolver.fixAddress(testAddress6));

// Third task
        System.out.println("Please, enter time: ");
        double minute = scanner.nextDouble();
        TrafficLight trafficLight = new TrafficLight();
        System.out.println(trafficLight.checkLight(minute));
    }
}
