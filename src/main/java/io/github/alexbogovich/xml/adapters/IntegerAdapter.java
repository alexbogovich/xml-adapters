package io.github.alexbogovich.xml.adapters;

public class IntegerAdapter extends NullableAdapter<Integer> {
    @Override
    public Integer unmarshal(String v) {
        if (isEmptyOrNull(v)) {
            return null;
        }
        return Integer.valueOf(v);
    }
}
