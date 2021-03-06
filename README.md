# Shat - P2P Encrypted Chat <img src="https://img.shields.io/badge/status-discontinued-red.svg">

This program use Kryonet ( http://code.google.com/p/kryonet/ ) read the license file into ./lib folder.
This program is relased under GNU GPL, read LICENSE file for more informations.

FAQ:

- Cos'è shat?
Shat è un programma sviluppato in Java che permette di inviare messaggi utilizzando una criptazione
asimmetrica (RSA a 2048bit) e una rete decentralizzata (P2P, senza un server centrale).

- Funziona già attualmente?
Questo progetto è stato ripreso più volte, e per dei bug ho dovuto riprogrammare più volte le stesse
classi, questo mi ha portato via moltissimo tempo, la versione scorsa era già funzionante ma conteneva
dei bug molto difficili da risolvere, quindi sono ripartito da un backup e al momento non è ancora funzionante.

- Quanto è sicuro?
Diciamo che la sicurezza della criptazione RSA a 2048bit dovrebbe garantire l'anonimato totale per
probabilmente altri 10/20 anni, il problema però è l'implementazione, credo che il mio codice sia
abbastanza sicuro, ma è anche possibile che ci siano invece dei bug enormi che creano buchi nella
sicurezza, il programma è open source in modo da permettere, a programmatori più esperti, di
contribuire alla sicurezza di questo progetto.

- Come funziona?
Funziona grazie ad un algoritmo di criptazione asicrona (RSA a 2048bit) che permette la criptazione
con una chiave pubblica (letteralmente condivisa con tutti) e la decriptazione solo con la chiave
privata (da tenere al sicuro), o anche il contrario in modo da firmare un messaggio. Per maggiori
informazioni potete cercare su Wikipedia il funzionamento dettagliato. Shat non è altro che un programma
in grado di inviare messaggi attraverso una rete P2P che però vengono prima criptati con questo algoritmo
di criptazione.

- Precisazioni personali:
Premetto che sono un ragazzo di 16 anni ed amo la programmazione, ma non ho mai studiato linguaggi
di programmazione a livello universitario, tutto quello che so è grazie alla mia velocità di apprendimento
e grande forza di volontà. Cerco di fare il mio meglio per imparare cose nuove scrivendo programmi che possono
ritornare utili a qualcuno, e visto che mi piace molto l'argomento 'Criptazione' ho deciso di provare a fare
questo progetto, non ritengo assolutamente che il codice sia perfetto, anzi credo che ci siano molti metodi
migliori di fare quello che ho fatto, per questo ho rilasciato anche il sorgente, in modo che chiunque possa
leggere e suggerirmi miglioramenti!
@Emilio, aka Shinil35
