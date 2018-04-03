package analyzer;

import excel.ExcelWriter;
import sorters.*;
import fillers.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Set;
import org.reflections.Reflections;

public final class AnalyzeUtils {
    public final static Reflections reflections = new Reflections("sorters");
    public final static Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(SorterClass.class);

    public static void annosFill(int numberOfElements, FillArrays runner) {
        Method[] methods = runner.getClass().getMethods();
        for (Class<?> clazz : annotated) {
            for (Method m : methods) {
                Filler annos = m.getAnnotation(Filler.class);
                if (annos != null) {
                    try {
                        int[] testArray = (int[]) m.invoke(runner, numberOfElements);
//                        System.out.print(m.getName() + "\n");
//                        System.out.print(Arrays.toString(testArray) + "\n");
                        annosFillSort(m, testArray, clazz);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }

    public static void annosFillSort(Method temp, int[] arr, Class<?> clazz) {
        Method[] methods = clazz.getMethods();
            for (Method m : methods) {
                SorterMethod annos = m.getAnnotation(SorterMethod.class);
                if (annos != null) {
                    try {
//                        long startTime = System.nanoTime();
                        runAndWrite(m, temp, clazz, arr);
                       // int[] testArray = (int[]) m.invoke(clazz.newInstance(), arr, 0, arr.length - 1);
                        //long endTime = System.nanoTime();
                       // long duration = endTime - startTime;
                       // System.out.println(temp.getName());
                      //  ExcelWriter.toExcelWriterXLSX(temp.getName(), testArray.length, duration, annotated);
                        System.out.print(m.getDeclaringClass().getSimpleName() + "\n");
//                        System.out.print(Arrays.toString(testArray) + "\n");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }

    public static void runAndWrite(Method m, Method temp, Class<?> clazz, int[] arr) {
        try {
            long startTime = System.nanoTime();
            int[] testArray = (int[]) m.invoke(clazz.newInstance(), arr, 0, arr.length - 1);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            ExcelWriter.toExcelWriterXLSX(temp.getName(), testArray.length, duration, annotated);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
