package lotto.domain.lottomachine;

import lotto.domain.LottoNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomLottoMachine implements LottoMachine {

    private static final int LOTTO_MIN_NUMBER = 1;
    private static final int LOTTO_MAX_NUMBER = 45;
    private static final int LOTTO_NUMBER_COUNT = 6;

    private final List<LottoNumber> lottoNumbers;

    public RandomLottoMachine() {
        lottoNumbers = IntStream.rangeClosed(LOTTO_MIN_NUMBER, LOTTO_MAX_NUMBER)
                                .boxed()
                                .map(LottoNumber::new)
                                .collect(Collectors.toList());
    }

    @Override
    public List<LottoNumber> generate() {
        List<LottoNumber> numbers = new ArrayList<>(lottoNumbers);
        Collections.shuffle(numbers);
        return new ArrayList<>(numbers.subList(0, LOTTO_NUMBER_COUNT));
    }
}
