import React, { Fragment, useEffect, useState } from "react";

function Solution() {
  const [isStart, setStart] = useState(false);
  const [minutes, setMinutes] = useState(0);
  const [seconds, setSeconds] = useState(0);

  const [setMin, setInitMin] = useState(0);
  const [setSec, setInitSec] = useState(0);

  const resetTimer = () => {
    setInitMin(0);
    setInitSec(0);
    setMinutes(0);
    setSeconds(0);
  };

  const startTimer = () => {
    setMinutes(setMin);
    setSeconds(setSec);
    setStart(true);
  };

  useEffect(() => {
    if (isStart) {
      const countdown = setInterval(() => {
        if (parseInt(seconds) > 0) {
          setSeconds(parseInt(seconds) - 1);
        }
        if (parseInt(seconds) === 0) {
          if (parseInt(minutes) === 0) {
            clearInterval(countdown);
          } else {
            setMinutes(parseInt(minutes) - 1);
            setSeconds(59);
          }
        }
      }, 1000);
      return () => clearInterval(countdown);
    }
  }, [isStart, minutes, seconds]);

  return (
    <Fragment>
      <label>
        <input
          type="number"
          value={setMin}
          onChange={(e) => setInitMin(e.target.value)}
        />
        Minutes
      </label>
      <label>
        <input
          type="number"
          value={setSec}
          onChange={(e) => setInitSec(e.target.value)}
        />
        Seconds
      </label>

      <button onClick={() => startTimer()}>START</button>
      <button onClick={() => setStart((check) => !check)}>
        PAUSE / RESUME
      </button>
      <button onClick={() => resetTimer()}>RESET</button>

      <h1 data-testid="running-clock">
        {minutes}:{seconds < 10 ? `0${seconds}` : seconds}
      </h1>
    </Fragment>
  );
}

export default Solution;
