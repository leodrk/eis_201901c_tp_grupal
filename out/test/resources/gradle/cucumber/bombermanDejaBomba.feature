
Feature: Bomberman puede poner bombas
 Como jugador dentro del juego
 Quiero dejar una bomba

Scenario: Bomberman intenta poner una bomba que explota y rompe una pared
 
 Given una Celda Con un Bomberman y una celda con una pared de melamina al "Norte"
 When bomberman deja una bomba de "3"
 Then la bomba explota y rompe la pared