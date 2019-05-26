Feature: Bomberman puede intentar moverse entre celdas
 Como jugador dentro del juego
 Quiero moverme entre celdas


Scenario: Bomberman suelta bomba y esta alcanza a Proto Max Jr

 Given un Bomberman y un Proto Max Jr
 When Bomberman suelta una bomba
 Then Proto Max Jr muere y suelta un poder