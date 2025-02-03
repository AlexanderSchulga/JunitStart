package tests.parametrize;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

//Для параметризации нескольких типов или параметров
public class TestNumberGreaterThanArguments implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        return Stream.of(
                Arguments.of(44, 14, "true"),
                Arguments.of(0, 140, "false"),
                Arguments.of(3, 3, "equals") //true или false--что в документации разработчика

        );
    }
}
