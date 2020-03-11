import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Test class for {@link FooBar}.s
 */
class FooBarTest {

    @Test
    void should_have_divisor_in_high_precedence() {
        //given
        int value = 51;

        //when
        String result = FooBar.process(value);

        //then
        assertThat(result).isEqualTo("FooBar");
    }

    @Test
    void should_analyse_content_in_order() {
        //given
        int value = 53;

        //when
        String result = FooBar.process(value);

        //then
        assertThat(result).isEqualTo("BarFoo");
    }

    @Test
    void should_return_foo_for_13() {
        //given
        int value = 13;

        //when
        String result = FooBar.process(value);

        //then
        assertThat(result).isEqualTo("Foo");
    }

    @Test
    void should_return_foobarbar_for_15() {
        //given
        int value = 15;

        //when
        String result = FooBar.process(value);

        //then
        assertThat(result).isEqualTo("FooBarBar");
    }

    @Test
    void should_return_foofoofoo_for_33() {
        //given
        int value = 33;

        //when
        String result = FooBar.process(value);

        //then
        assertThat(result).isEqualTo("FooFooFoo");
    }

    @Test
    void should_return_fooqix_for_27() {
        //given
        int value = 27;

        //when
        String result = FooBar.process(value);

        //then
        assertThat(result).isEqualTo("FooQix");
    }

}
