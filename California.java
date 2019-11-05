//California Problem by Isabella Rolfe
//11/05/19
public class California implements Comparable<California>{
    private String lastname;
    private static final String order="RWQOJMVAHBSGZXNTCIEKUPDYFL";
    public California(String lastname){
        this.lastname=lastname;
    }
    public String toString() {
        return lastname;
    }

    public int compareTo(California o) {
        if(lastname.equals(o.lastname)){
            return 0;
        }
        //comparing lastname to o.lastname
        int shorterlength=lastname.length();
        if(o.lastname.length()<shorterlength){
            shorterlength=o.lastname.length();
        }
        for(int x=0;x<shorterlength; x++){
            int pos1=order.indexOf(lastname.substring(x,x+1));
            int pos2=order.indexOf(o.lastname.substring(x,x+1));
            if(pos1<pos2){
                return -1;
            }
            else if(pos1>pos2){
                return 1;
            }
        }
        return (lastname.length()-o.lastname.length());
    }
    public static void main(String[] args) {
        California x=new California("HELLO");
        California y=new California("HELL");
        California g=new California("BYE");
        System.out.println(x.compareTo(y)); //positive
        System.out.println(y.compareTo(x)); //negative
        System.out.println(x.compareTo(x)); //0
        System.out.println(g.compareTo(y)); //positive
        System.out.println(y.compareTo(g)); //negative

    }

}

