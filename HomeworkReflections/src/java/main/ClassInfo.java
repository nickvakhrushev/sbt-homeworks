import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ClassInfo {
    /**
     * Выводит информацию о свойствах и методах класса.
     * @param p_class класс, информацию которого нужно вывести.
     */
    public static void printInfo(Class p_class) {
        printDeclaredFields(p_class);

        Method[] declaredMethods = p_class.getDeclaredMethods();
        for (Method method : declaredMethods
                ) {
            System.out.println(method.getName());
            printParameters(method);
            printModifiers(method);
        }
    }

    /**
     * Выводит список параметров метода.
     * @param method метод, список параметров которого нужно вывести
     */
    public static void printParameters(Method method) {
        Parameter[] parameters = method.getParameters();
        if (parameters.length > 0) {
            System.out.println("\tParameters:");

            for (Parameter parameter : parameters
                    ) {
                System.out.print("\t" + parameter.getName());
                System.out.print("\t" + parameter.getType());
            }

            System.out.println("");
        }
    }

    /**
     * Выводит информацию о модификаторах метода
     * @param method метод, информацию о котором нужно вывести
     */
    public static void printModifiers(Method method) {
        int modifiers = method.getModifiers();
        System.out.println("\tThis method is: ");

        System.out.print(Modifier.isStatic(modifiers) ? "\t\tstatic " : "");
        System.out.print(Modifier.isPrivate(modifiers) ? "\t\tprivate " : "");
        System.out.print(Modifier.isPublic(modifiers) ? "\t\tpublic " : "");
        System.out.print(Modifier.isProtected(modifiers) ? "\t\tprotected " : "");

        System.out.println("");
    }

    /**
     * Выводит информацию о свойствах метода
     * @param p_class класс, информацию о свойствах которого нужно вывести
     */
    public static void printDeclaredFields(Class p_class) {
        Field[] declaredFields = p_class.getDeclaredFields();

        for (Field field : declaredFields
                ) {
            System.out.print("Name = " + field.getName() + " type=" + field.getType());
            System.out.println("");
        }
    }
}
