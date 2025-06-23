import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    //    Её получится напечатать, если соблюдены требования:
    //    в строке не меньше 3 и не больше 19 символов,
    //    в строке есть только один пробел,
    //    пробел стоит не в начале и не в конце строки.
    @ParameterizedTest//(name = "#{index} - {0}")
    @CsvSource({
            "Имя пустое, '', false",
            "Длина имени = 1, Т, false",
            "Длина имени = 2, Ти, false",
            "Длина имени = 3, Т Ш, true",
            "Длина имени = 4, Ти Ш, true",
            "Длина имени = 13, Тимоти Шаламе, true",
            "Длина имени = 18, Тимоти ШаламеШалам, true",
            "Длина имени = 19, Тимоти ШаламеШаламе, true",
            "Длина имени = 20, Тимоти ШаламеШаламеШ, false",
            "Длина имени = 21, Тимоти ШаламеШаламеШа, false",
            "Длина имени = 30, Тимоти ШаламеШаламеШаламеШалам, false",
            "В имени нет пробела, Тимоти, false",
            "В имени один пробел, Тимоти Шаламе, true",
            "В имени два пробела, Тимоти Шаламе Ш, false",
            "В имени пробел в начале, ' Тимоти Шаламе', false",
            "В имени пробел в конце, 'Тимоти Шаламе ', false"
    })
    void testCheckNameToEmboss(String nameTest, String name, boolean expectedResult) {
        //System.out.println(name + name.length());
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expectedResult, actual);
    }
} 