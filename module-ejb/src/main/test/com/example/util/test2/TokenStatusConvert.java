package com.example.util.test2;

import java.util.Optional;

public class TokenStatusConvert {

    public TokenStatus convert(VtsTokenStatus vtsTokenStatus) {
        return Optional.ofNullable(vtsTokenStatus)
                .map(tokenStatus -> TokenStatus.getInstance(tokenStatus.name()))
                .orElse(null);
    }

    public TokenStatus convert(MdesTokenStatus mdesTokenStatus) {
        return Optional.ofNullable(mdesTokenStatus)
                .map(tokenStatus -> TokenStatus.getInstance(tokenStatus.name()))
                .orElse(null);
    }
}
