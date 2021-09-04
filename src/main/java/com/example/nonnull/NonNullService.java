package com.example.nonnull;

import lombok.NonNull;

public class NonNullService {

    public void myPubliMethod() {
        myPrivateMethod(null);
    }
    private String myPrivateMethod(@NonNull String aNonNullArgument) {
        return "";
    }
}
