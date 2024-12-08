package Lambda.Test;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Transport transport1 = new Transport("A1", "BMW", 200, 10);
        Transport transport2 = new Transport("S2", "BMW", 202, 10);
        Transport transport3 = new Transport("G6", "BMW", 223, 10);
        Transport transport4 = new Transport("Гранта спорт", "Лада", 100, 10);
        Transport transport5 = new Transport("пропан+", "Газель", 125, 10);

        Transport.arrTransports.add(transport1);
        Transport.arrTransports.add(transport2);
        Transport.arrTransports.add(transport3);
        Transport.arrTransports.add(transport4);
        Transport.arrTransports.add(transport5);

        //stream API
        long a = Transport.arrTransports.stream()
                        .filter(t -> t.getHorsePower()>200).count();

        System.out.println(a);

        transport1.information(Transport.arrTransports, t -> t.getHorsePower() > 150);

    }




}
