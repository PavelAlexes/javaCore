package Lambda.Test;

import java.util.ArrayList;

public class Transport{

    private String model;
    private String mark;
    private int horsePower;
    private int gabarits;
    public static ArrayList<Transport> arrTransports = new ArrayList<>();

    // constructor ------------------------------------------------------------------------
    public Transport(String model, String mark, int horsePower, int gabarits) {
        setModel(model);
        setMark(mark);
        setHorsePower(horsePower);
        setGabarits(gabarits);
        System.out.println(toString());;
    }
    // set ------------------------------------------------------------------------
    private void setModel(String model) {
        this.model = model;
    }

    private void setMark(String mark) {
        this.mark = mark;
    }

    private void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    private void setGabarits(int gabarits) {
        this.gabarits = gabarits;
    }

    // get ------------------------------------------------------------------------
    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getGabarits() {
        return gabarits;
    }

    // methods ------------------------------------------------------------------------
    public void information(ArrayList<Transport> transports, TransportInfo transportInfo) {
        for (Transport transport : transports){
            if(transportInfo.information(transport)){
                System.out.println(transport.getMark()+ " " + transport.getModel() +" Это спорткар!!!!");
            }else System.out.println(transport.getMark()+ " " + transport.getModel() +" Это медленное корыто!!!!");
        }
    }
    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", horsePower=" + horsePower +
                ", gabarits=" + gabarits +
                '}';
    }
}
