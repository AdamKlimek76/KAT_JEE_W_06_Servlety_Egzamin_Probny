import java.util.ArrayList;
import java.util.List;

public class SmurfDao {

    public List<Smurf> getList(){
        List<Smurf>smurfList=new ArrayList<>();
        smurfList.add(new Smurf("Pierwszy", "Dziki", "Jest dziki"));
        smurfList.add(new Smurf("Drugi", "Waleczny", "Jest waleczny"));
        smurfList.add(new Smurf("Trzeci", "Smutny", "Jest smutny"));
        smurfList.add(new Smurf("Czwarty", "Wesoly", "Jest wesoly"));
        smurfList.add(new Smurf("Piaty", "Pracowity", "Jest pracowity"));

        return smurfList;

    }
}
