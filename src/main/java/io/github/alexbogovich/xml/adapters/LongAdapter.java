package io.github.alexbogovich.xml.adapters;

public class LongAdapter extends NullableAdapter<Long> {

    @Override
    public Long unmarshal(String v) {
        if (isEmptyOrNull(v)) {
            return null;
        }
        return Long.valueOf(v);
    }
}
