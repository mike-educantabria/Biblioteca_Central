/*
 * @nombre: Miguel
 * @apellidos: Gutiérrez Caso
 */
package app.project;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PeliculaTest {
    private Pelicula pelicula1;
    private Pelicula pelicula2;
    
    public PeliculaTest() {
    }

//    @org.junit.jupiter.api.BeforeAll
//    public static void setUpClass() throws Exception {
//    }
//
//    @org.junit.jupiter.api.AfterAll
//    public static void tearDownClass() throws Exception {
//    }
//
//    @org.junit.jupiter.api.BeforeEach
//    public void setUp() throws Exception {
//    }
//
//    @org.junit.jupiter.api.AfterEach
//    public void tearDown() throws Exception {
//    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        pelicula1 = new Pelicula("Inception", "Christopher Nolan", LocalDate.of(2010, 7, 8));
        pelicula2 = new Pelicula("Los Otros", "Alejandro Amenábar", LocalDate.of(2001, 9, 7));
    }
    
    @AfterEach
    public void tearDown() {
        pelicula1 = null;
        pelicula2 = null;
    }

    /**
     * Test of getTitulo method, of class Pelicula.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        
        Pelicula instance = pelicula1;
        String expResult = "Inception";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        
        instance = pelicula2;
        expResult = "Los Otros";
        result = instance.getTitulo();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDirector method, of class Pelicula.
     */
    @Test
    public void testGetDirector() {
        System.out.println("getDirector");
        
        Pelicula instance = pelicula1;
        String expResult = "Christopher Nolan";
        String result = instance.getDirector();
        assertEquals(expResult, result);
        
        instance = pelicula2;
        expResult = "Alejandro Amenábar";
        result = instance.getDirector();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaLanzamiento method, of class Pelicula.
     */
    @Test
    public void testGetFechaLanzamiento() {
        System.out.println("getFechaLanzamiento");

        Pelicula instance = pelicula1;
        LocalDate expResult = LocalDate.of(2010, 7, 8);
        LocalDate result = instance.getFechaLanzamiento();
        assertEquals(expResult, result);
        
        instance = pelicula2;
        expResult = LocalDate.of(2001, 9, 7);
        result = instance.getFechaLanzamiento();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pelicula.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        Pelicula instance = pelicula1;
        String result = instance.toString();
        assertTrue(result.contains("Inception"));

        instance = pelicula2;
        result = instance.toString();
        assertTrue(result.contains("Los Otros"));

        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
}
