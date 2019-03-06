package io.github.alexbogovich.xml.adapters;

public class NullifyEmptyStringAdapter extends NullableAdapter<String> {
    @Override
    public String unmarshal(String v) {
        if (v == null) {
            return null;
        }
        if (isEmptyOrNull(v)) {
            return null;
        }
        return v;
    }
}
