# new feature
# Tags: optional
    
Feature: Bomberman puede intentar moverse entre celdas
 Como jugador dentro del juego
 Quiero moverme entre celdas


Scenario: Bomberman suelta bomba y esta alcanza a Proto Max Jr

 Given Bomberman suelta bomba y alcanza a Proto Max Jr
 When Proto Max Jr suelta un poder
 Then Bomberman puede saltar todo tipo de poder


