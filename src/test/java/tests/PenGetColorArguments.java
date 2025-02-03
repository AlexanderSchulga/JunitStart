package tests;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

//Для параметризации нескольких типов или параметров
public class PenGetColorArguments implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        return Stream.of(
                Arguments.of("Red", 14),
                Arguments.of("blue", 140),
                Arguments.of("Red", 100),
                Arguments.of("Yellow", 1055),
                Arguments.of("blue", 1054)
        );
    }
}
