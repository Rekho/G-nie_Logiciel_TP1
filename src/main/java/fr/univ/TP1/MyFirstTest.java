package fr.univ.TP1;
import java.util.logging.*;
import org.junit.*;

public class MyFirstTest {
	private static Logger log = Logger.getLogger(MyFirstTest.class.getSimpleName());
	
	@BeforeClass
	public static void firstInit(){
		log.info("Première méthode appelée");
	}
	
	@AfterClass
	public static void lastDestroy(){
		log.info("Dernière méthode appelée");
	}
	
	@Before
	public static void beforeTest(){
		log.info("Méthode appelée avant chaque test");
	}
	
	@After
	public static void AfterTest(){
		log.info("Méthode appelée après chaque test");
	}
	
	@Test
	public void assertionTrue(){
		log.info("Assertion Vraie");
		Assert.assertTrue(true);
	}
	
	@Test
	public void assertionFalse(){
		log.info("Assertion Fausse");
		Assert.assertTrue(false);
	}
	
	
}
