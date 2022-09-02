import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordValidTest {

    @Test
    void passwordLength4Test(){
        String tester = "ABC";
        boolean actual = PasswordValid.passwordLength(tester);
        assertEquals(false, actual);
    }
    @Test
    void passwordCheckTrueNumTest(){
        String tester = "AB01";
        boolean actual = PasswordValid.numberIncludet(tester);
        assertEquals(true, actual);
        // asserTrue(actual)
    }
    @Test
    void passwordCheckFalseNumTest(){
        String tester = "ABCD";
        boolean actual = PasswordValid.numberIncludet(tester);
        assertEquals(false, actual);
        // asserTrue(actual)
    }
    @Test
    void passwordCheckTrueUpperCaseTest(){
        String password = "ABCD";
        boolean actual = PasswordValid.upperIn(password);
        assertEquals(true, actual);
    }
    @Test
    void passwordCheckFalseUpperCaseTest(){
        String password = "abcd";
        boolean actual = PasswordValid.upperIn(password);
        assertEquals(false, actual);
    }
    @Test
    void passwordCheckTrueLowerCaseTest(){
        String password = "äsdfghjk";
        boolean actual = PasswordValid.lowerIn(password);
        assertEquals(true, actual);
    }
    @Test
    void passwordCheckFalseLowerCaseTest(){
        String password = "ASDFGH";
        boolean actual = PasswordValid.lowerIn(password);
        assertEquals(false, actual);
    }
    @Test
    void checkBadWordTrueTest(){
        String password = "Passwort1";
        boolean actual = PasswordValid.badWord(password);
        assertEquals(false, actual);
    }
    @Test
    void checkBadWordFalseTest(){
        String password = "Passwort";
        boolean actual = PasswordValid.badWord(password);
        assertEquals(true, actual);
    }
    @Test
    void validFunctionTrueTest(){
        String passwort = "HalloHallo12";
        String actual = PasswordValid.validFunction(passwort);
        assertEquals("Dein Passwort: HalloHallo12 wurde angenommen !!! ", actual);
    }
    @Test
    void validFunctionFalseTest(){
        String pass = "Passwort1";
        String actual = PasswordValid.validFunction(pass);
        assertEquals("Dein Passwort steht auf der Liste der unsicheren Passwörter !!!", actual);
    }
}
