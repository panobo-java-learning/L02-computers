import com.engeto.computers.Computer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Computer firemni_pocitac = new Computer();
        Computer osobni_pocitac = new Computer("Krtek Comps, s.r.o", 6, 17, false, true);

        List<Computer> computers = new ArrayList<>();

        computers.add(firemni_pocitac);
        computers.add(osobni_pocitac);

    }
}
