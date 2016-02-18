package waldock;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// SSH: git@github.com:KevinW1998/A20_BlackBoxTest.git

@RunWith(Suite.class)
@SuiteClasses({TestLadung.class, TestPersonen.class})
public class TestMainSuite { }
