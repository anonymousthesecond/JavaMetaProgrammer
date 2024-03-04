import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CodeBuilderTest {
    @Test
    public void testAddLine() {
        // Test adding lines to code builder
        CodeBuilder builder = new CodeBuilder();
        builder.addLine("public void exampleMethod() {");
        builder.indent();
        builder.addLine("System.out.println(\"Hello, world!\");");
        builder.dedent();
        builder.addLine("}");
        assertEquals("public void exampleMethod() {\n  System.out.println(\"Hello, world!\");\n}\n", builder.getCode());

        // Test adding lines with indentation changes only
        builder = new CodeBuilder();
        builder.addLine("public void exampleMethod() {");
        builder.indent();
        builder.dedent();
        builder.addLine("}");
        assertEquals("public void exampleMethod() {\n}\n", builder.getCode());

        // Test adding lines with dedent when current indentation level is 0
        builder = new CodeBuilder();
        builder.addLine("public void exampleMethod() {");
        builder.dedent(); // Dedent when current indentation level is 0
        assertEquals("public void exampleMethod() {\n", builder.getCode());

        // Test adding lines to an empty code builder
        builder = new CodeBuilder();
        assertEquals("", builder.getCode());
    }
}
