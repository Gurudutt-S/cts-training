i =30;
        function timer() {
            
            i = i - 1;
            postMessage(i);
            setTimeout("timer", 500);
        }
timer();