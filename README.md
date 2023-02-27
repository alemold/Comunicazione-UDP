# Applicazione Connessione Client-Server UDP

# Client.java
# Nel client c'è un ciclo infinito che permette di inviare messaggi (di tipo String)
# al server grazie alla connessione UDP, tramite DatagramSocket e i byte per permettere
# il trasferimento del messaggio da client a server, trasformandolo con il Datagram
# Packet da String a Byte

# Server.java
# Il server si mette in ascolto nella porta 2000 in attesa del client, quando si
# collega ... 
#
#