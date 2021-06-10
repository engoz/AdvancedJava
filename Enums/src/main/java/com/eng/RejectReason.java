package com.eng;

public enum RejectReason {
    T,
    L,
    S,
    P,
    N,
    Q,
    Y,
    V,
    R,
    U,
    M,
    F,
    O,
    C,
    A,
    B,
    I,
    K,
    E;

    public static final RejectReason TIMEOUT = T;
    public static final RejectReason MAX_LOSS = L;
    public static final RejectReason STALE_QUOTE = S;
    public static final RejectReason PROVIDER_REJECT = P;
    public static final RejectReason NONE = N;
    public static final RejectReason NO_LIQUIDITY = Q;
    public static final RejectReason SYSTEM_ERROR = Y;
    public static final RejectReason RANGE_CHECK = R;
    public static final RejectReason NO_PROVIDER = V;
    public static final RejectReason NOT_UPDATABLE = U;
    public static final RejectReason POOL_LIMIT = M;
    public static final RejectReason INSUFFICIENT_FUNDS = F;
    public static final RejectReason KMH = E;
    public static final RejectReason NOT_PERMITTED = O;
    public static final RejectReason CONVERSION_FAILED = C;
    public static final RejectReason MINIMUM_QTY = A;
    public static final RejectReason INSUFFICIENT_COLLATERAL = B;
    public static final RejectReason INTEGRATION_ERROR = I;
    public static final RejectReason FORWARD_OPEN_POS = K;

    private char getValue() {
        return name().charAt(0);
    }

    public static RejectReason valueOf(char c) {
        for (RejectReason reason : RejectReason.values()) {
            if (reason.getValue() == c) {
                return reason;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name();
    }

}
