package de.ithoc.training.exercise.loop;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LoopExerciseTest {
    @Test
    public void generateTextList() {
        LoopExercise loopExercise = new LoopExercise();

        List<String> strings = loopExercise.generateTextList();

        assertEquals(1000, strings.size());
    }
}