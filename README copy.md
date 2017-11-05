# simplest-sync-adapter
The bare minimum code that one will have to write to build a working sync adapter for an android app.

# Getting started

- You will have to define `accountType` in `authenticator.xml`
- The same account type will have to be used when declaring `syncadapter.xml`
- Same account type will have to be used when declaring `SyncUtils.java`
- You will have to define `contentAuthority` in `syncadapter.xml`
- Same will have to be defined in `SyncUtils.java`
- Same will have to be defined in `AndroidManifest.xml`
-

```
Note: In my experience, using `strings.xml` or any other way to declare
authorities or account type stops the sync adapter from working.
I know this is weird.
```