import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class dragonCaveTest {

    @Test
    void classCorrectUserInput() {
        assertEquals(1, dragonCave.classUserInput(new Scanner(String.valueOf(1))), "1 should return 1");
        assertEquals(2, dragonCave.classUserInput(new Scanner(String.valueOf(2))), "2 should return 2");
    }

    @Test
    void UserInputIsNot1or2(){
       assertThrows(NoSuchElementException.class, () -> dragonCave.classUserInput(new Scanner("3")));

    }

    @Test
    void UserInputIsString(){
       assertThrows(NoSuchElementException.class, () -> dragonCave.classUserInput(new Scanner("something")));
    }


}