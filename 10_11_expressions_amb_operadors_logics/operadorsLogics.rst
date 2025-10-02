EXPRESSIONS AMB OPERADORS LÓGICS
################################

la Clara és més jove que tu
edatClara < edatMeva

la Clara i el Marc són més joves que tu
edatClara < edatMeva && edatMarc < edatMeva

la Clara és més jove que tu i tu ets més jove que el Marc
edatClara < edatMeva && edatMeva<edatMarc

la Clara no és més jove que el Marc
!(edatClara < edatMarc)

no és cert que el Marc sigui més jove que la Clara
!(edatMarc < edatClara)

Ni el Marc és més jove que la Clara ni tu ets més jove que el Marc
!(edatMarc < edatClara) && !(edatMeva < edatMarc)

Tu ets més gran que la Clara i el Marc junts o bé la Clara i el Marc tenen la mateixa edat
edatMeva > (edatClara + edatMarc) || (edatClara == edatMarc)

// inventades per mi

A Barcelona fa més calor que a París o a Barcelona fa la mateixa temperatura que a Valencia
(temperaturaBarcelona > temperatura Paris) || (temperaturaBarcelona == temperaturaValencia)

El Marc es més baix que jo i el marc és més alt que la clara.
(alçadaMarc < alçadaMeva) && (alçadaMarc > alçadaClara)
