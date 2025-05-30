package io.learnstuff.features.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionOperations {

    public void readFields() {
        Object person = new Person();
        Field[] reflectionFields = person.getClass().getDeclaredFields();
        String[] actualFieldNames = new String[]{"id", "name", "location", "age"};
        String[] reflectionFieldsNames = new String[4];

        int counter = 0;
        for (Field field : Arrays.asList(reflectionFields)) {
            System.out.println(
                    "Read field name: " + field.getName() + ", expecting: " + actualFieldNames[counter]);
            reflectionFieldsNames[counter] = field.getName();
            counter++;
        }

        boolean fieldArrayAreEqual = Arrays.equals(reflectionFieldsNames, actualFieldNames);
        System.out
                .println((fieldArrayAreEqual) ? "Read all expected fields!" : "Read different fields!");
    }

    public void readClassModifiers() {
        Class<?> personCalss;
        try {
            personCalss = Class.forName("io.learnstuff.features.reflection.Person");
            int personModifiers = personCalss.getModifiers();

            System.out.println("Class is public: " + Modifier.isPublic(personModifiers));
            System.out.println("Class is abstract: " + Modifier.isAbstract(personModifiers));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readClassConstructors() {
        Class<?> personCalss;
        try {
            personCalss = Class.forName("io.learnstuff.features.reflection.Person");

            Constructor<?>[] constructors = personCalss.getConstructors();
            for (Constructor<?> constructor : Arrays.asList(constructors)) {
                System.out.println("Read constructor: " + constructor.getName() + ", with: "
                        + constructor.getParameterCount() + " parameters.");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readClassMethods() {
        Class<?> personCalss;
        try {
            personCalss = Class.forName("io.learnstuff.features.reflection.Person");

            Method[] methods = personCalss.getDeclaredMethods();
            for (Method method : Arrays.asList(methods)) {
                System.out.println("Read constructor: " + method.getName() + ", with: "
                        + method.getParameterCount() + " parameters.");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
