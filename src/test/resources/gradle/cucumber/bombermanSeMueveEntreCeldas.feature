Feature: Bomberman puede intentar moverse entre celdas
 Como jugador dentro del juego
 Quiero moverme entre celdas

Scenario: Bomberman intenta moverse de una celda a una celda contigua vacia
 
 Given un Bomberman con una celda vacia al "Norte"
 When Bomberman se mueve al "Norte"
 Then Bomberman cambia su posicion