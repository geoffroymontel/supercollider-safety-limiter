SafetyLimiter : UGen {
	*ar { |input, releaseTime = 0.1, holdTime = 0.5|
		^this.multiNew('audio', input, releaseTime, holdTime);
	}
}
