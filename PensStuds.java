package Level1;

public class PensStuds {
    public static void main(String[]args){
        double pens=14;double students=3;double notdistributed=14%3; double pensfordistribution= 14-notdistributed;
        double pensgot= pensfordistribution/3;
        System.out.println("Each Student Got "+pensgot+" Pens");
        System.out.println("Pens not distributed are: "+ notdistributed);
    }
}
