package sorters;

import analyzer.TimeAnalyze;
import excel.ExcelWriter;
import fillers.*;

import java.io.IOException;
import java.lang.reflect.*;
import java.sql.Time;
import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {

        FillArrays runner = new FillArrays();
        TimeAnalyze test = new TimeAnalyze();
        int numberOfExperiments = 20;
        if (args.length == 1) {
            try {
                numberOfExperiments = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                numberOfExperiments = 20;
            }
        }

        test.workTime(numberOfExperiments, runner);
        try {
            ExcelWriter.createCharts(numberOfExperiments);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        вынести рефлексию из аналайзера в отдельный класс (reflection util)
        класс excelWriter или excelUtils должен принимать информацию о данных, обработать и записать в excel
        юнит-тесты: размер, плохие параметры,
        генерик в абстрактном сортировке, каждый наследник должен поставить этот конструктор
         */

//        public int[] annosFill(FillArrays runner) {
//            for (Method m : methods) {
//                Filler annos = m.getAnnotation(Filler.class);
//                if (annos != null) {
//                    try {
//                        // long t1 = System.nanoTime();
//                        int[] testArray = (int[]) m.invoke(runner, 10);
////                      long elapsedTime = System.nanoTime() - t1;
////                      System.out.println(elapsedTime);
//                        System.out.println(m.getName());
//                        System.out.print(Arrays.toString(testArray) + "\n");
//                        return testArray;
//                    }
//                    catch (Exception ex) {
//                        ex.printStackTrace();
//                    }
//                }
//            }
//        }
//        for (Method m : methods) {
//            Filler annos = m.getAnnotation(Filler.class);
//            if (annos != null) {
//                try {
//                    // long t1 = System.nanoTime();
//                    int[] testArray = (int[]) m.invoke(runner, 10);
////                      long elapsedTime = System.nanoTime() - t1;
////                      System.out.println(elapsedTime);
//                    System.out.println(m.getName());
//                    System.out.print(Arrays.toString(testArray) + "\n");
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }

//          for (Method m : methods2) {
//                SorterMethod annos = m.getAnnotation(SorterMethod.class);
//                if (annos != null) {
//                    try {
//                        int[] testArray = (int[]) m.invoke(quick, testArray);
//                    }
//                }
//          }
//    }
    }
}
