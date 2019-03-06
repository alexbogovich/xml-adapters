package io.github.alexbogovich.xml.adapters;

import java.time.Instant;

public class InstantEpochSecAdapter extends NullableAdapter<Instant> {
    @Override
    public Instant unmarshal(String v) {
        if (isEmptyOrNull(v)) {
            return null;
        }

        try {
            long epochSeconds = Long.parseLong(v);
            return Instant.ofEpochSecond(epochSeconds);
        } catch (Exception ignore) {
            return null;
        }
    }
}
