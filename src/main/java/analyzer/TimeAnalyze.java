package analyzer;

import fillers.FillArrays;

public class TimeAnalyze {
   public void workTime(int exNumber, FillArrays runner) {
       int elements = 5000;
        for (int i = 0; i <= exNumber; i++, elements += 1000) {
            AnalyzeUtils.annosFill(elements, runner);
        }
   }
}
//    public void annosFill(FillArrays runner) {
//        Method[] methods = runner.getClass().getMethods();
//        Reflections reflections = new Reflections("sorters");
//        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(SorterClass.class);

//        for (Class<?> clazz : annotated) {
//            for (Method m : methods) {
//                Filler annos = m.getAnnotation(Filler.class);
//                if (annos != null) {
//                    try {
//                        // long t1 = System.nanoTime();
//                        int[] testArray = (int[]) m.invoke(runner, 10);
////                        System.out.print(m.getName() + "\n");
////                        System.out.print(Arrays.toString(testArray) + "\n");
//                        annosFillSort(testArray, clazz);
////                      long elapsedTime = System.nanoTime() - t1;
////                      System.out.println(elapsedTime);
//                    } catch (Exception ex) {
//                        ex.printStackTrace();
//                    }
//                }
//            }
//        }
//    }

//    public void annosFillSort(int[] arr, Class<?> clazz) {
//        Method[] methods2 = clazz.getMethods();
////        System.out.println(clazz);
//        for (Method m : methods2) {
//            SorterMethod annos = m.getAnnotation(SorterMethod.class);
//            if (annos != null) {
//                try {
//                    int[] testArray = (int[]) m.invoke(clazz.newInstance(), arr, 0, arr.length - 1);
//                    System.out.print(m.getDeclaringClass().getCanonicalName() + "\n");
//                    System.out.print(Arrays.toString(testArray) + "\n");
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }
//    }
//}

