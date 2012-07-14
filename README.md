ModFM Pseudo-Ugen
=================

An implementation of Lazzarini and Lysaght's modified approach to FM synthesis in SuperCollider.

Installation
------------

* Make sure the file ModFM.sc is placed in your sclang extensions path. On Linux, this was `~/.local/share/SuperCollider/Extensions` but may be different for different operating systems.

Useage
------

This pseudo-Ugen provides implementations of square, triangle and sawtooth oscillators using ModFM. Use can use them just like the other SC Ugens.

```java
// Square waveform oscillator
{ ModFMSquare.ar(440, 1) }.play;

// Triangle waveform oscillator
{ ModFMTri.ar(440, 1) }.play;

// Sawtooth waveform oscillator
{ ModFMSaw.ar(440, 1) }.play;

```

Contributing to ModFM Pseudo-Ugen
---------------------------------

* Check out the latest master to make sure the feature hasn't been implemented or the bug hasn't been fixed yet
* Check out the issue tracker to make sure someone already hasn't requested it and/or contributed it
* Fork the project
* Start a feature/bugfix branch
* Commit and push until you are happy with your contribution
* Initiate a [pull request](https://help.github.com/articles/using-pull-requests)

Credits
-------

* [unsymbol](https://github.com/unsymbol)

Copyright
---------

Copyright (c) 2012 Philip Cunningham. See LICENSE.txt for further details.
