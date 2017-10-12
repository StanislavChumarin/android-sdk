package com.qualaroo.ui.render;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.RestrictTo;

import com.qualaroo.internal.model.ColorThemeMap;

import static android.support.annotation.RestrictTo.Scope.LIBRARY;

@RestrictTo(LIBRARY)
public final class Theme {

    private static final @ColorInt int DIM_TYPE_LIGHT = Color.parseColor("#D4CACED6");
    private static final @ColorInt int DIM_TYPE_VERY_LIGHT = Color.parseColor("#D4FAFAFA");
    private static final @ColorInt int DIM_TYPE_DARK = Color.parseColor("#D4323433");

    public static Theme from(ColorThemeMap colorThemeMap) {
        Theme theme = new Theme();
        theme.backgroundColor = parseColorSafely(colorThemeMap.backgroundColor());
        theme.borderColor = parseColorSafely(colorThemeMap.borderColor());
        theme.textColor = parseColorSafely(colorThemeMap.textColor());
        theme.buttonTextColor = parseColorSafely(colorThemeMap.buttonTextColor());
        theme.buttonEnabledColor = parseColorSafely(colorThemeMap.buttonEnabledColor());
        theme.buttonDisabledColor = parseColorSafely(colorThemeMap.buttonDisabledColor());
        theme.accentColor = parseColorSafely(colorThemeMap.buttonEnabledColor());
        theme.dimColor = parseDimType(colorThemeMap.dimType());
        return theme;
    }

    private static @ColorInt int parseColorSafely(String color) {
        try {
            return Color.parseColor(color);
        } catch (IllegalArgumentException | NullPointerException e) {
            return Color.BLACK;
        }
    }

    private static @ColorInt int parseDimType(String dimType) {
        if (dimType == null) {
            return DIM_TYPE_DARK;
        }
        switch(dimType) {
            case "light":
                return DIM_TYPE_LIGHT;
            case "very_light":
                return DIM_TYPE_VERY_LIGHT;
        }
        return DIM_TYPE_DARK;
    }

    @ColorInt private int dimColor;
    @ColorInt private int backgroundColor;
    @ColorInt private int borderColor;
    @ColorInt private int textColor;
    @ColorInt private int buttonTextColor;
    @ColorInt private int buttonEnabledColor;
    @ColorInt private int buttonDisabledColor;
    @ColorInt private int accentColor;

    @VisibleForTesting Theme(int dimColor, int backgroundColor, int borderColor, int textColor, int buttonTextColor, int buttonEnabledColor, int buttonDisabledColor, int accentColor) {
        this.dimColor = dimColor;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.textColor = textColor;
        this.buttonTextColor = buttonTextColor;
        this.buttonEnabledColor = buttonEnabledColor;
        this.buttonDisabledColor = buttonDisabledColor;
        this.accentColor = accentColor;
    }

    private Theme() {
        //for static factory method
    }

    public int dimColor() {
        return dimColor;
    }

    public int backgroundColor() {
        return backgroundColor;
    }

    public int borderColor() {
        return borderColor;
    }

    public int textColor() {
        return textColor;
    }

    public int buttonTextColor() {
        return buttonTextColor;
    }

    public int buttonEnabledColor() {
        return buttonEnabledColor;
    }

    public int buttonDisabledColor() {
        return buttonDisabledColor;
    }

    public int accentColor() {
        return buttonEnabledColor();
    }
}
