import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class dragonCaveTest {

    @Test //succeeds and return 1 or 2
    void classCorrectUserInput() {
        assertEquals(1, dragonCave.classUserInput(new Scanner(String.valueOf(1))), "1 should return 1");
        assertEquals(2, dragonCave.classUserInput(new Scanner(String.valueOf(2))), "2 should return 2");
    }

    @Test
    void UserInputIsNot1or2(){ //expected to fail because the input is not 1 or 2
       assertThrows(NoSuchElementException.class, () -> dragonCave.classUserInput(new Scanner(String.valueOf(3))));

    }

    @Test
    void UserInputIsString(){ //expected to fail because the input is a string
       assertThrows(NoSuchElementException.class, () -> dragonCave.classUserInput(new Scanner("something")));
    }


}