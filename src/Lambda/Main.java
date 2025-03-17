package Lambda;//package Lambda.Test;
//
//import Lambda.GetList;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        GetList firstList = new GetList();
//
//
//        //stream API
////        Transport.arrTransports.forEach(System.out::println);
////
////        System.out.println("-------------------------------------");
////
////        List<Transport> a = Transport.arrTransports.stream().sorted(Comparator.comparing(Transport::getHorsePower)).toList();
////
////        a.forEach(System.out::println);
//
//
//
//
//
//
//
//
//
//
//    }
//}

//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("aaaaa");
        list.add("aaaa");
        list.add("aaa");

        list.sort((o1, o2) -> {
            if (o1.length() > o2.length()){
                return 1;
            } else if (o2.length() > o1.length()) {
                return -1;
            }else return 0;
        });


//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()){
//                    return 1;
//                } else if (o2.length() > o1.length()) {
//                    return -1;
//                }else return 0;
//            }
//        });
        System.out.println(list);
    }
        }

