package ocpjp8;

import ocpjp8.ch02.singletonpattern.LlamaTrainer;
import org.junit.Test;

/**
 * Created by grzesikl on 13/06/2016.
 */
public class LlamaTrainerTest {

    @Test
    public void testFeedLlamas() throws Exception {
        new LlamaTrainer().feedLlamas(2);
    }
}