package ru.geekbrains.lessons.les14.homeWork;
/*
1. Написать метод, которому в качестве аргумента передается не пустой одномерный
целочисленный массив. Метод должен вернуть новый массив, который получен путем
вытаскивания из исходного массива элементов, идущих после последней четверки. Входной
массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить
RuntimeException.
Написать набор тестов для этого метода (по 3-4 варианта входных данных).
Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class ArrayProcessingTest {
    @ParameterizedTest
    @MethodSource("fillSliceParams")
    void sliceTest(int[] in, int [] out) {
        Assertions.assertArrayEquals(out, ArrayProcessing.sliceArray(in));
    }

    static Stream<Arguments> fillSliceParams() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[] {1,5,4,8,2,1,4,8,6,4,5,77,1}, new int[] {5,77,1}));
        list.add(Arguments.arguments(new int[] {4}, new int[] {}));
        list.add(Arguments.arguments(new int[] {1,5,4,8,2,1,4,8,6,5,77,1}, new int[] {8,6,5,77,1}));
        return list.stream();
    }

    @Test
    void testSliceException() {
        Assertions.assertThrows(RuntimeException.class, () -> ArrayProcessing.sliceArray(new int[] {1,2,54,5}));
    }

    @Test
    void oneAndFourTest() {
        Assertions.assertTrue(ArrayProcessing.hasOneAndFour(new int[] {1,1,1,4,4,4,1}));
    }
}
