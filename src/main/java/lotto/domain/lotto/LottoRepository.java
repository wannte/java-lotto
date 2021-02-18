package lotto.domain.lotto;

import lotto.domain.lottomachine.LottoMachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoRepository {

    private final List<Lotto> lottos = new ArrayList<>();

    public void generateLottoByTicket(final LottoMachine lottoMachine, final int ticketCount) {
        for (int i = 0; i < ticketCount; i++) {
            lottos.add(new Lotto(lottoMachine.generate()));
        }
    }

    public List<Lotto> toList() {
        return Collections.unmodifiableList(lottos);
    }

}
