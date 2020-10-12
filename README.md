# Soundboard

Play and upload short sound samples on your Android device.

## Usage

Select a sound file from your storage directory and add it to the sounds list. It will be copied to the private application folder and can be played on touch.

You can delete the original file at any time. The sound sample will still be available in the application until you decide to delete it.

## Download

Download from the Google Play store: https://play.google.com/store/apps/details?id=nl.kodr.soundboard 

## Building

If you want to build the application yourself, the easiest way is to use the latest [Android Studio](http://developer.android.com/sdk/index.html) along with the Android SDK.

Alternatively you can use the gradle wrapper to build the application.

You will at least need to install the following SDK packages:

* Latest versions of Android SDK Tools and Android SDK Platform-tools
* Android SDK Build-tools 23.0.2 or later
* Android SDK Platform 23 or later
* Android Support Library 23.1.1 or later

Clone the repository:

    git@github.com:koosdrost/exstudiantes-soundboard.git

Switch to application directory and make the gradle wrapper executable:

    cd soundboard
    chmod +x gradlew

To build a *debug* version, run:

    ./gradlew assembleDebug

To build a *release* version, you first have to alter the settings for accessing your keystore in the `app/gradle.properties` file.
Then run:

    ./gradlew assembleRelease

After a successful build, the (signed) APKs will be located in `app/build/outputs/apk`.

## Credits

Credits and thanks to Meonwax for providing the base (https://github.com/meonwax/soundboard.git)

## Resources

[Launcher icon](https://www.iconfinder.com/icons/916730/music_sound_voice_volume_icon) by Mohamed Mbarki licensed under [Creative Commons (Attribution 3.0 Unported)](http://creativecommons.org/licenses/by/3.0/).

## License

[GPL3](LICENSE)
