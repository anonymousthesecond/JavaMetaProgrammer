

---

# Java Code Generation Toolkit

The Java Code Generation Toolkit is a lightweight library for dynamically generating Java code using code templates and builders. It provides simple yet powerful functionalities for generating code snippets, method definitions, and class structures, making it ideal for automating code generation tasks in Java projects.

## Features

- **CodeTemplate**: Define code templates with placeholders for dynamic content.
- **CodeBuilder**: Build Java code dynamically by assembling lines of code with proper indentation.
- **Parameterization**: Easily substitute placeholders in code templates with desired values.
- **Robustness**: Handle edge cases and errors gracefully with built-in error handling and exception management.

## Usage

### Installation

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/your_username/java-code-generation-toolkit.git
   ```

2. Add the `java-code-generation-toolkit.jar` file to your Java project's classpath.

### System Requirements

- Java Development Kit (JDK) 8 or higher

### How to Use

1. **CodeTemplate Usage**:

   ```java
   CodeTemplate template = new CodeTemplate("public void $methodName($argType $argName) { /* Method body */ }");
   template.setValue("methodName", "exampleMethod");
   template.setValue("argType", "String");
   template.setValue("argName", "param");
   String renderedTemplate = template.render();
   ```

2. **CodeBuilder Usage**:

   ```java
   CodeBuilder builder = new CodeBuilder();
   builder.addLine("public void exampleMethod() {");
   builder.indent();
   builder.addLine("System.out.println(\"Hello, world!\");");
   builder.dedent();
   builder.addLine("}");
   String generatedCode = builder.getCode();
   ```

### Testing

- Unit tests are provided to ensure the correctness of the code. Run the tests using JUnit:

  ```bash
  cd java-code-generation-toolkit
  javac -cp .:junit-platform-console-standalone-1.8.2.jar *.java
  java -jar junit-platform-console-standalone-1.8.2.jar --class-path . --scan-class-path
  ```

### Example

```java
public class Main {
    public static void main(String[] args) {
        // Example usage of the Java code generation toolkit
        CodeTemplate template = new CodeTemplate("public void $methodName($argType $argName) { /* Method body */ }");
        template.setValue("methodName", "exampleMethod");
        template.setValue("argType", "String");
        template.setValue("argName", "param");
        String renderedTemplate = template.render();
        System.out.println(renderedTemplate);
    }
}
```

---

