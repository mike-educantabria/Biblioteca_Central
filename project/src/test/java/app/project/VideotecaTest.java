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
import org.junit.jupiter.api.Disabled;


public class VideotecaTest {
    private Pelicula pelicula1;
    private Pelicula pelicula2;
    private Videoteca videoteca;
    
    public VideotecaTest() {
    }
    
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
        
        videoteca = new Videoteca(5);
        videoteca.agregarPelicula(pelicula1);
        videoteca.agregarPelicula(pelicula2);
    }
    
    @AfterEach
    public void tearDown() {
        pelicula1 = null;
        pelicula2 = null;
        videoteca = null;
    }

    /**
     * Test of agregarPelicula method, of class Videoteca.
     */
    @Disabled
    @Test
    public void testAgregarPelicula() {
        System.out.println("agregarPelicula");
        Pelicula pelicula = null;
        Videoteca instance = null;
        boolean expResult = false;
        boolean result = instance.agregarPelicula(pelicula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPelicula method, of class Videoteca.
     */
    @Disabled
    @Test
    public void testEliminarPelicula() {
        System.out.println("eliminarPelicula");
        Pelicula pelicula = null;
        Videoteca instance = null;
        Boolean expResult = null;
        Boolean result = instance.eliminarPelicula(pelicula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarPeliculaExistente method, of class Videoteca.
     */
    @Test
    public void testConsultarPeliculaExistente() {
        System.out.println("consultarPeliculaExistente");

        String titulo = "Inception";
        Videoteca instance = videoteca;
        Pelicula expResult = pelicula1;
        Pelicula result = instance.consultarPelicula(titulo);
        assertEquals(expResult, result);
        
        titulo = "Los Otros";
        instance = videoteca;
        expResult = pelicula2;
        result = instance.consultarPelicula(titulo);
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    /**
     * Test of consultarPeliculaNoExistente method, of class Videoteca.
     */
    @Test
    public void testConsultarPeliculaNoExistente() {
        System.out.println("consultarPeliculaNoExistente");
        
        String titulo = "Matrix";
        Videoteca instance = videoteca;
        Pelicula result = instance.consultarPelicula(titulo);
        assertNull(result);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    /**
     * Test of consultarPeliculaIgnoreCase method, of class Videoteca.
     */
    @Test
    public void testConsultarPeliculaIgnoreCase() {
        System.out.println("consultarPeliculaIgnoreCase");

        String titulo = "INCEPTION";
        Videoteca instance = videoteca;
        Pelicula expResult = pelicula1;
        Pelicula result = instance.consultarPelicula(titulo);
        assertEquals(expResult, result);
        
        titulo = "los otros";
        instance = videoteca;
        expResult = pelicula2;
        result = instance.consultarPelicula(titulo);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    /**
     * Test of consultarDirector method, of class Videoteca.
     */
    @Disabled
    @Test
    public void testConsultarDirector() {
        System.out.println("consultarDirector");
        String director = "";
        Videoteca instance = null;
        instance.consultarDirector(director);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarLanzamiento method, of class Videoteca.
     */
    @Disabled
    @Test
    public void testConsultarLanzamiento() {
        System.out.println("consultarLanzamiento");
        int ano = 0;
        Videoteca instance = null;
        instance.consultarLanzamiento(ano);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarVideoteca method, of class Videoteca.
     */
    @Disabled
    @Test
    public void testMostrarVideoteca() {
        System.out.println("mostrarVideoteca");
        Videoteca instance = null;
        instance.mostrarVideoteca();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumPeliculas method, of class Videoteca.
     */
    @Disabled
    @Test
    public void testGetNumPeliculas() {
        System.out.println("getNumPeliculas");
        Videoteca instance = null;
        int expResult = 0;
        int result = instance.getNumPeliculas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
