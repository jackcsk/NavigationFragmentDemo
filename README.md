This project contains 2 applications:
  * NavigationFragment-1.0.0
  * NavigationFragment-2.0.2

The 2 Android app modules illustrates the different behaviors of NavigationFragment 1.0.0 vs 2.0.2, on the following aspect:
  * The primary fragment's `onPause()` and `onStop()` methods are triggered on 1.0.0, but not on 2.0.2
  * The primary fragment's content is cleared on `presentFragment()` call, on 1.0.0, but not on 2.0.2