package com.intheeast.generics.typeinference;

@FunctionalInterface
public interface Converter<U, T> {
    T convert(U input);
}