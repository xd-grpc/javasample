package io.grpc;

import static org.junit.Assert.assertTrue;


import org.junit.Test;

import java.util.logging.Logger;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static final Logger logger = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        logger.info("This is the AppTest ...");
        assertTrue( true );
    }
}
