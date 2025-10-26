package generator;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.JCommander;

public class Generator {

    @Parameter(names={"--type", "-t"})
    String type;

    @Parameter(names={"--type", "-t"})
    String type;


    public static void main(String[] args) {
        new Generator().run();
    }

    private void run() {
        var data = generate();
        save(data);
    }

    private Object generate() {
        return null;
    }

    private void save(Object data) {

    }
}
