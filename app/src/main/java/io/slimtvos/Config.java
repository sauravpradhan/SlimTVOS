package io.slimtvos;

/**
 * Your settings. In the original project build.sh generates this file from config.properties;
 * in Android Studio you edit the values here and press Run / Build APK.
 * Most of these can also be changed later on the TV, in Free My TV > Home Settings.
 */
final class Config {
    private Config() {}

    // Free key from https://www.themoviedb.org/settings/api ("API Read Access Token" or "API Key").
    // Empty = the home screen still works, just without the trending picks.
    static final String TMDB_KEY = "";
    // Optional free key from https://api.watchmode.com/ : picks open the title's page in its app.
    static final String WATCHMODE_KEY = "";
    // Two-letter country: decides which titles are on which streaming app (IN, US, GB...).
    static final String TMDB_REGION = "IN";
    // Your city, for the weather and the sunset (decimal degrees). Mumbai:
    static final String LATITUDE = "19.0760";
    static final String LONGITUDE = "72.8777";
    static final String CITY = "Mumbai";
    // auto (follows the TV) or en, pt, es, de, ru, fr, ja, zh-CN, hi ...
    static final String LANGUAGE = "auto";
    // Crypto prices in USD, EUR, BRL... (Binance has no INR pairs, so INR would show dollars).
    static final String CURRENCY = "USD";
    // C, F or auto
    static final String TEMPERATURE = "C";
    // Streaming services to leave out of the picks, comma separated (e.g. "prime,hulu"). Empty = none.
    static final String HIDE_SERVICES = "";
    // auto (dark from sunset to sunrise), light or dark
    static final String THEME = "auto";

    static final boolean DISABLE_ASSISTANT = false; // true also turns off Google Assistant (mic button stops working)
    static final boolean SHOW_CRYPTO = true;        // Binance prices on home and screensaver
    static final boolean HIDE_ANIMATION = false;    // true leaves cartoons and anime out of the picks
    static final boolean SCREENSAVER = true;        // false keeps the TV's own screensaver
}
