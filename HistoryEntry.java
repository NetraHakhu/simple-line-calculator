import java.time.LocalDateTime;

public class HistoryEntry {

    private final LocalDateTime time;
    private final String expression;
    private final String result;

    public HistoryEntry(LocalDateTime time,String expression,String result){
        this.time=time;
        this.expression=expression;
        this.result=result;
    }

    @Override
    public String toString(){ return expression+" = "+result+" ("+time+")"; }
// converts onject data into readable text formaat
    public static void main(String[] args){
        HistoryEntry entry=new HistoryEntry(LocalDateTime.now(),"2+3","5");
        System.out.println(entry);
    }
}
