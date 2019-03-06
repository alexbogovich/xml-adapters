package io.github.alexbogovich.xml.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public abstract class NullableAdapter<T> extends XmlAdapter<String, T> {
    @Override
    public String marshal(T v) {
        if (v == null)
            return null;
        return v.toString();
    }

    public boolean isEmptyOrNull(String v) {
        if (v == null) {
            return true;
        }

        if (v.equalsIgnoreCase("null")) {
            return true;
        }

        if (v.trim().equals("")) {
            return true;
        }

        return false;
    }
}
