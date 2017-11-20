# simplest-sync-adapter
The bare minimum code that one will have to write to build a working sync adapter for an android app.

# Know and remember when using SyncAdapters in your apps
- You will have to compulsorily use the `AccountManager` framework of Android.
- You will have to compulsorily declare `StubProvider` in your app. You
may choose not to use it though and use your own database for content storage.


# Getting started

- You will have to define `accountType` in `authenticator.xml`
- The same `accountType` will have to be used when declaring `syncadapter.xml`
- Same `accountType` will have to be used when declaring `SyncUtils.java`
- You will have to define `contentAuthority` in `syncadapter.xml`
- Same will have to be defined in `SyncUtils.java`
- Same will have to be defined in `AndroidManifest.xml`
- Change sync time `SYNC_FREQUENCY` to your convenience in `SyncUtils` class

```
Note: In my experience, using `strings.xml` or any other way to declare
'authorities' or 'accountType' stops the sync adapter from working.
I know this sounds weird.
```

# Donations!
If this project has helped you understand issues, be productive by using this library in your app or just being nice to me, you can always donate me

* **Using Bitcoins**: at this address `3QJEmgqXsT1CFLtURYWxzmww59DdKYVwNk`

* **Using Paypal**: [Pay Jay](https://www.paypal.me/jaydeepw)

# Inspiration
- [UDI COHEN's outdated blog post.](http://blog.udinic.com/2013/07/24/write-your-own-android-sync-adapter) Yet thankful to it.
- [Obsolete sync adapter github projects](https://github.com/search?utf8=%E2%9C%93&q=sync+adapter+language%3AJava&type=Repositories&ref=advsearch&l=Java&l=)