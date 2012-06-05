ModFM Pseudo-Ugen
=================

Installation
-----------

1. Make sure the file ModFM.sc is placed in your sclang extensions path.
   On Linux, this was ~/.sclang/SCClassLibrary/Extensions but may be
   different for different operating systems.

Useage 
------

This pseudo-Ugen provides implementations of square, triangle and sawtooth
oscillators using ModFM. Use can use them just like the other SC Ugens.

```java
// Square waveform oscillator
ModFMSquare.ar(440, 1);

// Triangle waveform oscillator
ModFMTri.ar(440, 1);

// Sawtooth waveform oscillator
ModFMSaw.ar(440, 1);

```