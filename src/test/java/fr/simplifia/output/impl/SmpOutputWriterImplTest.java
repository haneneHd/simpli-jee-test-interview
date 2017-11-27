package fr.simplifia.output.impl;

import java.io.PrintStream;

import org.mockito.Mockito;
import org.testng.annotations.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

/**
 * Created by simplifia on 18/09/17.
 */
public class SmpOutputWriterImplTest {

    private PrintStream stream;

    @Test
    public SmpOutputWriterImplTest(){
        stream = Mockito.mock(PrintStream.class);
       doNothing().when(stream).println(anyString());
    }

    //TODO
    @Test
    public void testPrint() throws Exception {
    }

    //TODO
    @Test
    public void testPrintEmpty() throws Exception {
        stream = Mockito.mock(PrintStream.class);
        doReturn("write smth").when(stream).equals(" ");



    }

    //TODO
    @Test
    public void testPrintNull() throws Exception {
    }

}