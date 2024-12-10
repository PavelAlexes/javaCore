package Lambda.Test;

import java.util.ArrayList;
import java.util.List;

public class GetList {

    public static List<Transport> getTransportArrList(){
        return List.of(
                new Transport("A1", "BMW", 200, 10),
                new Transport("S2", "BMW", 202, 10),
                new Transport("G6", "BMW", 223, 10),
                new Transport("Гранта спорт", "Лада", 100, 10),
                new Transport("пропан+", "Газель", 125, 10)
        );
    }

}
