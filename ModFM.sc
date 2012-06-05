// ModFM pseudo-Ugen
//
//
// Uses a modified version of the FM synthesis algorithm
// to create bandlimited oscillators.
//
// This code was adapted and extended from a discussion on
// the SC mailing list between Douglas Lamb and Nathaniel Virgo.
//
// http://comments.gmane.org/gmane.comp.audio.supercollider.user/75545
//
// Code by: @unsymbol

ModFM {
  const <lower = 82.406889228217;
  const <upper = 1479.9776908465;

  classvar <>car_ratio = 1;
  classvar <>mod_ratio = 2;
}

ModFMSaw : ModFM {

  classvar <>car_ratio = 1;
  classvar <>mod_ratio = 1;

  *ar {arg freq=440, mul = 1;

    ^Limiter.ar(
      (LeakDC.ar(
        Integrator.ar(
          exp(((10**(freq.linlin(lower,upper,2,1,nil)))
            * SinOsc.ar(freq * mod_ratio)) - (10**(freq.linlin(lower,upper,2,1,nil))))
            * SinOsc.ar(freq * car_ratio)
          , 0.999), 0.99)), 0.9, 0.01) * mul
  }
}

ModFMSquare : ModFM {

  *ar {arg freq=440, mul = 1;

    ^Limiter.ar(
      (Integrator.ar(
          exp(((10**(freq.linlin(lower,upper,2,1,nil)))
            * SinOsc.ar(freq * mod_ratio)) - (10**(freq.linlin(lower,upper,2,1,nil))))
            * SinOsc.ar(freq * car_ratio)
          , 0.999)), 0.9, 0.01) * mul
  }
}

ModFMTri : ModFM {

  *ar {arg freq=440, mul = 1;

    ^Limiter.ar(
      (Integrator.ar(ModFMSquare.ar(freq), 0.999) * 0.02)) * mul // Simplify integration
  }
}