# Free My TV: Android Studio project

An Android Studio (Gradle) repackaging of https://github.com/simbasjungles/free-my-tv (MIT license, see LICENSE).
Clock typeface is custom and can be found at /assests/fonts/CSaurav.ttf

## Build
1. Install Android Studio (any recent version; it brings JDK 17+). Let it install SDK Platform 34.
2. File > Open > choose this folder. Wait for the Gradle sync (first sync downloads Gradle 8.9 and the Android plugin).
3. Open `app/src/main/java/io/slimtvos/Config.java` and set your city, region and TMDB key.
4. Build > Build Bundle(s) / APK(s) > Build APK(s). The file is `app/build/outputs/apk/debug/app-debug.apk`.

## Install on the TV (Google TV / Android TV, Android 9+)
```
adb connect <TV_IP>:5555
adb install -r app-debug.apk
adb shell "appops set io.freemytv AUTO_START allow || appops set io.freemytv APP_AUTO_START allow"
```
The second command is for TCL TVs. Then on the TV: open *Free My TV* > *Home Screen* > *Free My TV* and accept the
USB debugging prompt (tick "Always allow").

## Go back
On the TV: *Free My TV* > *Home Screen* > *Original*. Do this before uninstalling the app.

## Notes
- Debug and release builds are both signed with the debug key. Updates must be signed with the same key, so keep it
  (`~/.android/debug.keystore`) or use your own signing config in `app/build.gradle`.
- The app disables stock apps through the TV's own ADB (the DEBLOAT list in `HomeMode.java`). Review that list for
  your TV model before switching the home screen.
- Only the Google TV / Android TV app is included. The LG and Samsung versions in the original repo are not.
